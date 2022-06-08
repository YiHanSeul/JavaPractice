package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		//생성된 bean 2개를 가져다
		//객체에 저장된 값 확인
		
		ApplicationContext factory= new ClassPathXmlApplicationContext("com/test04/applicationContext.xml");
		Emp lee =factory.getBean("lee",Emp.class); //가져오는게 emp class에서 가져오는거라고 명시해두면 따로 형변환 안해도됨
		Emp hong=(Emp)factory.getBean("hong");
		
		System.out.println(lee);
		System.out.println(hong);
	}
}
