package com.boot.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.jdbc.model.dto.MyDto;
import com.boot.jdbc.model.service.MyService;

@Controller
@RequestMapping("/myboard")
public class MyBoardController {
	@Autowired
	private MyService myService;
	
	@GetMapping("/list")
	public String selectList(Model model) {
		System.out.println("list!!!");
		//List<MyDto> list=myService.selectList();
		model.addAttribute("list",myService.selectList());
		return "myboardlist";
	}
	
	@RequestMapping("/detail")
	public String selectOne(Model model ,int myno) {
		System.out.println("myno!!!"+myno);
		
		model.addAttribute("one",myService.selectOne(myno));
		return "myboarddetail";
	}
	
	@GetMapping("/insertform")//글작성페이지 이동
	public String insertForm() {
		return "myboardinsert";
	}
	
	@GetMapping("/insert")//작성글 저장
	public String insert(Model model, MyDto dto) {
		int res=myService.insert(dto);
		if(res>0) {
			return "redirect:list";
		}else {
			return "myboardinsert";
		}
	}
	
	@GetMapping("updateform") //글주성 페이지 이동
	public String updateForm(Model model, int myno) {
		
		model.addAttribute("dto",myService.selectOne(myno));
		return "myboardupdate";
	}
	
	@GetMapping("update")
	public String update(MyDto dto) {
		int res= myService.update(dto);
		if(res>0) {
			return "redirect:list";
		}else {
			return "myboardupdate";
		}
	}
	
	@GetMapping("delete")
	public String delete(int myno) {
		int res=myService.delete(myno);
		if(res>0) {
			return "redirect:list";
		}else {
			return "redirect:detail?myno="+myno;
		}
	}
	
	
}
