package com.mvc.file;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@RequestMapping(value="/form.do")
	public String getUploadForm() {
		return "uploadForm";
	}
	
	@RequestMapping("/upload.do")
	public String fileUpload(HttpServletRequest request,Model model, UploadFile uploadFile, BindingResult result) {//bindingResult는 binding하다가 error가 발생하면 에러코드를 객체에 담아줌
		
		//유효성 검사. 파일의 크기가 0인지
		fileValidator.validate(uploadFile, result);
		
		if(result.hasErrors()) {//에러가 있는지 검사 반환값은 boolean true면 에러발생
			System.out.println("Errrororrorororor");
			return "uploadForm";
		}
		return null;
	}
}
