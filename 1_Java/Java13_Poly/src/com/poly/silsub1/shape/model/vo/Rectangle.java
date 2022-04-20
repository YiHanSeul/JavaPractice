package com.poly.silsub1.shape.model.vo;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	//생성자
	public Rectangle() {}
	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}
	//getter &setter
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	//추상메서드
	@Override
	public double area() {
		
		return width*height;
	}

	@Override
	public double perimeter() {
		return (width+height)*2;
	}

}
