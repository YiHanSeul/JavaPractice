package com.chap02.stringBuffer_Builder;

public class Run {
	public static void main(String[] args) {
		//Run.method1();
		Run.method2();
	}
	public static void method1() {
		StringBuilder sb=new StringBuilder("Hello World");
		System.out.println(sb);
		
		
		//str에 +=를 하면 뒤에 이어서 붙히는게아닌 새로운 공간에 안녕하세요 저는이한슬입니다를 합친 새로운 주소값이 나옴
		//string은 변경하면 주소값에 변함
		String str="안녕하세요 ";
		System.out.println("str 기존 : "+str +", 주소: "+System.identityHashCode(str));
		str+="저는 이한슬입니다.";
		System.out.println("str 추가후 : "+str +", 주소: "+System.identityHashCode(str));

		//스트링 버퍼를 변경해도 주소값에 변화가 없음
		StringBuffer sf=new StringBuffer("아침은 아직");
		System.out.println("sf 기존 : "+sf+", 주소 : "+sf.hashCode()+", "+System.identityHashCode(sf));
		sf.append("황사 가득!");
		System.out.println("sf 추가후 : "+sf+", 주소 : "+sf.hashCode()+", "+System.identityHashCode(sf));
	}
	public static void method2() {
		StringBuilder sb=new StringBuilder("난 ");
		
		//append
		sb.append("커피 먹어야지");
		sb.append("~~").append(" 배고파~");
		System.out.println(sb);
		
		//length
		System.out.println(sb.length());
		//insert
		sb.insert(2, "잠이 덜 깨서");
		System.out.println(sb);
		
		//delete
		sb.delete(1, 9);
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println(sb);
	}
}
