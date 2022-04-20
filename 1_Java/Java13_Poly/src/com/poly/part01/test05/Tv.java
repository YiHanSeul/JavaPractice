package com.poly.part01.test05;

//추상메서드, 상수필드만 들어갈수있음
public interface Tv {
	int volUp();
	int volDown();
	
	//각클래스에 인터페이스 Tv 상속
	//lg tv(+1)와 samsung tv(+3)를 만들어서
	//볼륨업/다운작성
	//생성자가 호출될 시 "tv"가 켜졌습니다. "라고 출력
	//tvClosed()메소드 만들어 호출 하면 "tv 꺼졌습니다." 라고 출력
	
}
