package com.practice;

import java.util.Scanner;

public class Example {

	public void sample1() {
		Scanner input = new Scanner(System.in);
		int i, j, k, m;
		double q;
		System.out.println("국어 점수입력: ");
		i = input.nextInt();

		System.out.println("영어 점수입력: ");
		j = input.nextInt();

		System.out.println("수학 점수입력: ");
		k = input.nextInt();

		m = i + j + k;
		q = m / 3;
		System.out.println("합계" + m);
		System.out.println("평균" + q);
		System.out.println(((i >= 40 && j >= 40 && k >= 40)&&q>=60?"합격":"불합격"));
	}
	public void sample2() {
		Scanner input =new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name=input.nextLine();
		
		System.out.println("학년을 입력하세요");
		int grade =input.nextInt();
		
		System.out.println("반을 입력하세요");
		int clas =input.nextInt();
		
		System.out.println("번호를 입력하세요");
		int num = input.nextInt();
		
		System.out.println("성별을 입력하세요(M/W)");
		char gender=input.next().charAt(0);
		
		System.out.println("성적을 입력하세요 ");
		double score =input.nextDouble();
		
		System.out.println(grade+"학년 "+clas +"반 "+num+"번 "+ (gender=='M'? "남학생 ":"여학생 ")+name+"은 성적이 "+score+"이다");

	}
	
	public void sample3() {
		Scanner input= new Scanner(System.in);
		int num =input.nextInt();
		
		System.out.println(num>=0?"양수다":"음수다");
	}
	
	public void sample4() {
		Scanner input= new Scanner(System.in);
		int num =input.nextInt();
		int na =num%2;
		
		String s=na%2==0?"짝수다":"홀수다";
		System.out.println(s);
		
	}

}
