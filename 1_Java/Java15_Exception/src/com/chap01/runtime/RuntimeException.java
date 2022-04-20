package com.chap01.runtime;

import java.io.IOException;
import java.util.Scanner;

import com.chap02.throwsPrac.Run;

//소스코드로 예외처리가 가능함 Runtime Error
public class RuntimeException{
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
		RuntimeException re = new RuntimeException();
		// re.test1();
		//re.test2();
		re.test3();
	}

	public void test1() {
		int no = 100;

		System.out.print("나누는 수 하나 입력: ");
		int inputNum = sc.nextInt();
//		if(inputNum==0) {
//			System.out.println("0을 입력했습니다.");
//		}else {
//			int res=no/inputNum;
//			System.out.println("나누기 결과:" +res);
//		

		// try catch 처리
		try {
			int res = no / inputNum;
			System.out.println("나누기 결과: " + res);
		} catch (ArithmeticException e) { // 정수를 0으로 나눴을때
			e.printStackTrace();
			System.out.println("Exception 발생");
		}
	}

	public void test2() {
		try {
			// ClassCastException -형변환할때 잘못 형변화 했을경우
			/*Object obj = 'a';
			System.out.println(obj);
			String str = (String) obj;
			System.out.println(str);*/
			//ArrayIndexOutOfBoundsException
			/*int arr[]=new int[2];
			arr[0]=1;
			arr[1]=2;
			arr[2]=3;
			System.out.println("이거 실행될까?");*/
			String str=null;
			int length=str.length();
		} catch (ClassCastException e) {
			System.out.println("예외 발생! 형변환 불가!");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("예외 발생 배열의 범위를 넘어감!");
			System.out.println(e.getMessage());
		}catch(NullPointerException e){
			System.out.println("예외 발생 null인데 길이 재려고해서!");
			System.out.println(e.getMessage());
		}finally {
		}
			System.out.println("예외가 발생하던, 안하던 무조건 finally는 무조건 실행함");
		}
	
		public void test3(){
			Run r=new Run();
			try {
				r.methodB();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

