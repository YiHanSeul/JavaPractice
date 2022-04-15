package com.silsub1.objArr.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private int number;
	private String name;
	
	//객체를 생성하면서 초기화
	public Student() {}
	
	public Student(int grade, int classroom,int number, String name) {
		this.grade=grade;
		this.classroom=classroom;
		this.number=number;
		this.name=name;
	}
	
	//getter & setter는 생성자와 비슷해보이지만 다름 객체생성하면서 초기화하는게아니라
	//값을 변경, 받아올때 사용
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String information() {
		return grade+"학년 "+classroom+"반 "+number+"번 "+name;
	}
}
