package com.boot.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@SpringBootApplication
public class StartBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(StartBoot1Application.class, args);
	}
	@RequestMapping("/")
	public String root() {
		System.out.println("WEfwefwe");
		return "index";
	}
	
	@RequestMapping("/inputForm")
	public String inputForm() {
		System.out.println("twew");
		return "input";
	}
}
