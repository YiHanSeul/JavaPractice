package com.boot.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class StartBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(StartBoot1Application.class, args);
	}
	@RequestMapping("/") //페이지명을 명시하지않고 그냥 접근함
	public String root() {
		return "index";
	}
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
}
