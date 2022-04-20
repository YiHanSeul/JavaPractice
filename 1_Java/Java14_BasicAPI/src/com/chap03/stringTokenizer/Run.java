package com.chap03.stringTokenizer;

import java.util.StringTokenizer;

public class Run {
	//countToken :토큰 수 파악
	//nextToken : 토큰 읽어오기
	//hasMoreToken :토큰이 남아있는지 확인, boolean
	public static void main(String[] args) {
		String str="이한슬,22,서울 관악구,여";
		StringTokenizer st=new StringTokenizer(str,",");
		System.out.println(st.countTokens());
		
		//다음에 토큰 있는지 확인하고 있으면 true, 없으면 false
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
}
