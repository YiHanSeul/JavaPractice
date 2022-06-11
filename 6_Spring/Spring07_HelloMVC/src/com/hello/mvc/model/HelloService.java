package com.hello.mvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	@Autowired
	private HelloDao dao; //hellodao 타입의bean은 자동으로 객체 생성됨
	
	public String getHello() {
		return "Hello,"+dao.getHello();
	}
}
