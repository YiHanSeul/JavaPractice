package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.dto.TestDto;
import com.test.service.TestService;

@Controller
public class TestController {
	@Autowired
	private TestService service;
	
	@GetMapping("/inputForm")
	public String inputForm() {
		return "input";
	}
	
	@PostMapping("/input")
	public String input(Model model ,TestDto dto) {
		System.out.println("이름 : "+dto.getName());
		System.out.println("나이 : "+dto.getAge());
		System.out.println("주소 : "+dto.getAddr());
		int res=service.input(dto);
		if(res>0) {
			model.addAttribute("dto",service.selectList());
			return "output";
		}else {
			return "input";
		}
	}
	
}
