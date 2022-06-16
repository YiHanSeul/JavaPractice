package com.mvc.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import com.mvc.file.validate.FileValidator;
import com.mvc.file.validate.UploadFile;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private FileValidator fileValidator;

	@RequestMapping(value = "/form.do")
	public String getUploadForm() {
		return "uploadForm";
	}

	@RequestMapping("/upload.do")
	public String fileUpload(HttpServletRequest request, Model model, UploadFile uploadFile, BindingResult result) {
		// bindingResult는 binding하다가error가발생하면에러코드를 객체에 담아줌

		System.out.println(uploadFile.getDesc() + "~~~");
		System.out.println(uploadFile.getFile().getSize());
		// 유효성 검사. 파일의 크기가 0인지
		fileValidator.validate(uploadFile, result);

		if (result.hasErrors()) {// 에러가 있는지 검사 반환값은 boolean true면 에러발생
			return "uploadForm";
		}

		MultipartFile file = uploadFile.getFile();
		String filename = file.getOriginalFilename();// 업로드한 파일의 실제이름

		UploadFile fileobj = new UploadFile();
		fileobj.setFilename(filename);
		fileobj.setDesc(uploadFile.getDesc());

		InputStream inputStream = null;
		OutputStream outputStream = null;

		try {
			inputStream = file.getInputStream();

			// webutils는 reqeust에 포함되어있는데이터들을 webutils로 좀더 쉽게 접근 할수있게함
			String path = WebUtils.getRealPath(request.getSession().getServletContext(), "/storage"); // storage까지 붙혀서
																										// path가 만들어짐
			System.out.println("업도드 될 실제 경로 :" + path);
			File storage = new File(path);
			if (!storage.exists()) { // path의 경로가 있는지 확인
				storage.mkdirs();// 없으면 경로를 만들어라
			}

			File newfile = new File(path + "/" + filename);// 파일네임을 붙혀서 파일객체를 만듬
			if (!newfile.exists()) { // 파일이 존재하는지 확인
				newfile.createNewFile(); // 없으면 파일 만들어라
			}

			outputStream = new FileOutputStream(newfile);// 파일을읽어서 외부로 저장할 파일을 매개변수로 넣음
			int read = 0;
			byte[] b = new byte[(int) file.getSize()];// 파일의 사이즈 만큼 byte단위로 만듬

			while ((read = inputStream.read(b)) != -1) { //하나씩 읽어서
				outputStream.write(b, 0, read); //내보내기
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				inputStream.close();
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		model.addAttribute("fileobj",fileobj);
		return "uploadFile";
	}
}
