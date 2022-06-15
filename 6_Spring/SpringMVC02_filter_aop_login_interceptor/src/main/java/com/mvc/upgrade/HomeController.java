package com.mvc.upgrade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.upgrade.model.dto.BoardDto;
import com.mvc.upgrade.model.service.BoardService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired //자동 객체 주입 controller -> service ->dao ->db 
	private BoardService service;
	//model데이터의 응답처리를 할때 사용하는 객체
	//원래는request를 사용했다면 model이라는 곳에 담음 ModelAndView는 데이터랑, 뷰랑 같이 담고 Model은 데이터만 담음
	@RequestMapping("/list.do")
	public String list(Model model) {
		logger.info("SELECT LIST");
		model.addAttribute("list",service.selectList());
		return "mvclist";
	}
	
	@RequestMapping("/detail.do")
	public String detail(Model model, int myno) {
		logger.info("Select One");
		model.addAttribute("dto",service.selectOne(myno));
		return "mvcdetail";
	}
	@RequestMapping("/insertform.do")
	public String insertForm(Model model) {
		
		logger.info("INSERT FORM");
		return "mvcinsert";
	}
	
	@RequestMapping("insertres.do")
	public String insertRes(BoardDto dto) {
		logger.info("INSERT RES");
		int res=service.insert(dto);
		
		if(res>0) {
			return "redirect:list.do";
		}else {
			return "mvcinsert";
		}
	}
	
	@RequestMapping("/updateform.do")
	public String updatForm(int myno, Model model) {
		logger.info("UPDATE FORM");
		
		model.addAttribute("dto",service.selectOne(myno));
		return "mvcupdate";
	}
	
	@RequestMapping("/updateres.do")
	public String updateRes(BoardDto dto) {
		logger.info("UPDATE RES");
		
		int res=service.update(dto);
		
		System.out.println(dto.getMyno());
		if(res>0) {
			return "redirect:detail.do?myno="+dto.getMyno();
		}else {
			return "redirect:updateform.do?myno="+dto.getMyno();
		}
	}
	
	@RequestMapping("/delete.do")
	public String delete(int myno) {
		
		logger.info("DELETE");

		int res=service.delete(myno);
		if(res>0) {
			System.out.println("성공!");
			return "redirect:list.do";
		}else {
			System.out.println("실패");
			return "redirect:detail.do?myno="+myno;
		}
	}
}
