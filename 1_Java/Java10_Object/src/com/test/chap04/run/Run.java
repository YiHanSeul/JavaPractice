package com.test.chap04.run;

import java.util.Date;

import com.test.chap04.model.dto.User;

public class Run {

	public static void main(String[] args) {
		//기본생성자로 객체생성
		User u1=new User();
		u1.information();
		
		
		//매개변수있는 생성자로 객체 생성
		User u2=new User("hanseul","1234","한슬");
		u2.information();
		
		User u3=new User("user3","pass02","이스이",new Date());
		u3.information();
	}

}
