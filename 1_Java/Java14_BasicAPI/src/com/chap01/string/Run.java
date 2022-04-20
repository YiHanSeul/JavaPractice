package com.chap01.string;

public class Run {

	public static void main(String[] args) {
		Run.method1();
	}

	public static void method1() {
		// 문자열을 리터럴로
		String str = "abc";
		String str1 = "abc";

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		String str2=new String("abc");
		String str3=new String("abc");
		
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		System.out.println("-------------------------");
		//charAt(i);
		System.out.println(str.charAt(1));
		//concat(합치기);
		System.out.println(str.concat("def"));
		//contains(포함여부)
		System.out.println(str.contains("a"));
		//equals()
		System.out.println(str.equals("abc"));
		//length()
		System.out.println(str.length());
		
		//split(문자구분)
		str1="a,b,c,d,e,f";
		String[] sArr= str1.split(",");
		
		for(String arr:sArr) {
			System.out.print(arr);
		}
		for(int i=0; i<sArr.length;i++) {
			System.out.print(sArr[i]);
		}
		
		//toUpperCase(대문자로)
		System.out.println(str.toUpperCase());
		//substring(잘라내기)
		System.out.println(str1.substring(2,4));
		//trim(공백 제거)
		str2="             abc        ";
		System.out.println(str2);
		System.out.println(str2.trim());
	}

}
