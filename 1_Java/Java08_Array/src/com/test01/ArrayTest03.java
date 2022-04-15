package com.test01;

public class ArrayTest03 {

	public static void main(String[] args) {
		// new ArrayTest03().shallowCopy();
//	new ArrayTest03().deepCopy();
		//new ArrayTest03().deepCopy2();
		new ArrayTest03().deepCopy3();
		
	}

	public void shallowCopy() {
		// 얕은복사 -> 배열의 주소만 복사한다.
		int[] oArr = { 1, 2, 3, 4, 5 };
		int[] cArr = oArr;

		String str = "";
		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";

		}
		System.out.println("1. oArr:" + str);

		// 복사한 배열의 값을 str에 저장하여 출력;
		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i];
		}
		System.out.println("2. cArr" + str);

		// 원본 배열 값 변경
		oArr[0] = 99;

		// 변경 후 출력
		str = "";
		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";

		}
		System.out.println("1. oArr:" + str);

		// 변경후 출력
		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i];
		}
		System.out.println("2. cArr" + str);

		System.out.println("oARR의 hashcode : " + oArr.hashCode());
		System.out.println("cARR의 hashcode : " + cArr.hashCode());

	}

	public void deepCopy() {
		int[] oArr = { 1, 2, 3, 4, 5 };
		int[] cArr = new int[oArr.length];

		for (int i = 0; i < oArr.length; i++) {
			cArr[i] = oArr[i];
		}
		// 원본출력
		String str = "";

		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";
		}
		System.out.println(" oArr :  " + str);
		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println(" cArr :  " + str);

		oArr[0] = 99;
		str = "";

		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";
		}
		System.out.println(" oArr :  " + str);
		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println(" cArr :  " + str);

	}

	public void deepCopy2() {

		// System에 있는 arraycopy()
		int[] oArr = { 1, 2, 3, 4, 5 };
		int[] cArr = new int[10];

		// arraycopy(src,srcPos,dest,destPos,length)
		// src :원본배열, srcPos:복사시작 위치
		// dest :copy배열, destPos:붙혀넣기 시작위치
		// length: 복사될 길이
		System.arraycopy(oArr, 0, cArr, 3, oArr.length);
		String str = "";

		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";
		}
		System.out.println(" oArr :  " + str);
		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println(" cArr :  " + str);
		
		System.out.println("oArr의 hashcode: "+oArr.hashCode());
		System.out.println("cArr의 hashcode: "+cArr.hashCode());
	}

	public void deepCopy3() {
		//clone() 그냥 통째로 복사해서 하나더 만듬
		
		int [] oArr= {1,2,3,4,5};
		int [] cArr=new int[10];
		
		System.out.println("준비된 cArr의 hashcode : "+cArr.hashCode());
		
		cArr=oArr.clone();
		System.out.println("클론한 cArr의 hashcode : "+cArr.hashCode());
		System.out.println("원본 oArr의 hashcode : "+oArr.hashCode());

		String str = "";

		for (int i = 0; i < oArr.length; i++) {
			str += oArr[i] + " ";
		}
		System.out.println(" oArr :  " + str);
		str = "";
		for (int i = 0; i < cArr.length; i++) {
			str += cArr[i] + " ";
		}
		System.out.println(" cArr :  " + str);
		
		System.out.println("cArr의 hashcode: "+cArr.hashCode());
		System.out.println("oArr의 hashcode: "+oArr.hashCode());

		
		
	}
}
