package com.chap02.throwsPrac;

import java.io.IOException;

public class Run {
	//마지막 예외처리로 끝까지 넘기면 JVM이 알아서 처리해버림 
	public static void main(String[] args) throws IOException{
		try {
			methodA();
		} catch (IOException e) {
			System.out.println("Main()에서 처리");
		}
	}
	
	public static void methodA() throws IOException{
		methodB();
		
	}
	public static void methodB() throws IOException{
		
		methodC();
		
	}
	//발생하는 IOException 예외처리를 넘길거임 throws를 써주면 
	//methodC를 호출한 메서드가 처리를 해야함.
	public static void methodC() throws  IOException{
		//예외가 생기면 예외와 관련된 객체가 
		/*try {
			throw new IOException();
		} catch (Exception e) {
			System.out.println("예외발생");
		}*/
		
		throw new IOException();
	}
}
