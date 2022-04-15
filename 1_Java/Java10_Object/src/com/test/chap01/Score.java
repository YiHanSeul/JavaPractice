package com.test.chap01;

public class Score {
	private String name="이한슬";
	private int kor=90;
	private int eng=82;
	private int math=97;
	
	//생성자
	public Score() {}
	
	//총합을 구해 출력하는 기능
	public void sum() {
		int sum =kor +eng+math;
		System.out.println("총합은 : "+sum);
	}
	//평균을 구해 출력하는 기능
	public void avg() {
		double avg=(kor+eng+math)/3;
		System.out.println(name+"학생의 평균은 : "+avg);
	}
	//제일 높은 점수를 받은 과목을 찾아 출력하는 기능
	public void max() {
		if(kor>eng &&kor>math) {
			System.out.println("점수가 가장 높은 과목은 국어 : " + kor+ "점 입니다.");
		}else if(eng>kor && eng>math){
			System.out.println("점수가 가장 높은 과목은 : " + eng+ "점 입니다.");
		}
		else{
			System.out.println("점수가 가장 높은 과목은 : " + math+ "점 입니다.");
		}
	}
	//필드값 확인할수 있는 기능
	public void prn() {
		System.out.println(name+" 학생의 국어점수 : "+kor+", 영어점수: "+eng+", 수학점수: "+math+" 이다");
	}
	
}
