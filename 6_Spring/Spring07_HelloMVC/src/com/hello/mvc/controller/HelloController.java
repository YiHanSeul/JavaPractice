package com.hello.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hello.mvc.model.HelloService;

@Controller
public class HelloController {
	
	@Autowired
	private HelloService service;
	
	@RequestMapping("/hello.do")
	public String getHello(Model model) {
		
		String value=service.getHello();
		
		model.addAttribute("message",value);
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/bye.do")
	public ModelAndView getBye(String name, String no) {
		ModelAndView mav=new ModelAndView();
		
		mav.setViewName("/WEB-INF/views/bye.jsp");
		mav.addObject("message","Bye "+name+no); //전달하려는 데이터 message라는 이름으로 담았음
		
		return mav;
	}
}
