package com.boot.leaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.boot.leaf.dto.LeafDto;

@Controller
public class LeafController {
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name","Thymeleaf");
		//컨트롤러가 응답하는 페이지는 templates폴더 안에 기본적으로 있어야함 
		//이게 싫으면 경로를 application.properties에서 prefix suffix를 설정해야함 
		return "hello";
	}
	
	@GetMapping("/util")
	public String util() {
		return "utility";
	}
	
	@GetMapping("/expression")
	public String expression(Model model) {
		model.addAttribute("name","ThymeLeaf");
		
		LeafDto dto =new LeafDto("spring",1);
		model.addAttribute("dto",dto);
		
		List<LeafDto> list=new ArrayList<>();
		list.add(dto);
		list.add(new LeafDto("java",2));
		list.add(new LeafDto("css",3));
		list.add(new LeafDto("github",4));
		
		model.addAttribute("list",list);
		
		return "expression";
	}
}
