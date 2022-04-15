package com.arrayPractice1.sample;

import java.util.Scanner;

public class ArraySample {

	public void test2() {
		int ar[] = new int[10];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 100) + 1;
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		int max=ar[0];
		int min=ar[0];
		
		for(int i=0;i<ar.length;i++) {
			if(max<ar[i]) {
				max=ar[i];
			}
			if(min>ar[i]) {
				min=ar[i];
			}
		}
		System.out.println("최대 값은 : "+max);
		System.out.println("최소 값은 : "+min);
	}
	
	public void test4() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자입력 : ");
		String value=sc.next();
		int sum=0;
		for(int i=0;i<value.length();i++) {
			/*String s=value.substring(i, i+1);
			sum+=Integer.parseInt(s);*/
			sum+=Integer.parseInt(value.substring(i, i+1));
		}
		System.out.println("더한 숫자값은 : "+sum);
	}
	
	public void test5() {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		String value=sc.next();
		int sum=0;
		
		for(int i=0; i<value.length();i++) {
			sum+=(int)value.charAt(i)-48;
		}
		System.out.println("sum: "+sum);
	}
}
