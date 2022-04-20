package com.poly.silsub1.shape.model.vo;

public class Circle extends Shape{
	private double radius;
	public static final double PI=Math.PI;
	
	//생성자
	public Circle() {}
	public Circle(double radius) {
		this.radius=radius;
	}
	//getter &setter
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public static double getPi() {
		return PI;
	}
	
	//면적 계산
	@Override
	public double area() {
		double area=radius*radius*PI;
		return area;
	}
	//둘레 계산
	@Override
	public double perimeter() {
		return (radius*2)*PI;
	}

}
