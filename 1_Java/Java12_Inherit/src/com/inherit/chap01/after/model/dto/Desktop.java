package com.inherit.chap01.after.model.dto;

import java.util.Date;

import javax.annotation.processing.SupportedAnnotationTypes;

public class Desktop extends Computer{
	private boolean allInOne;
	
	
	//생성자
	public Desktop() {}


	public Desktop(String brand, String productNumber, String productCode, String productName, int price, Date date,
			String cpu, int hdd, int ram, String os, boolean allInOne) {
		//coputer의 매개변수생성자로 넘어가서 자기가 처리할건 하고 부모로 넘겨줄건 넘겨줌
		super(brand, productNumber, productCode, productName, price, date, cpu, hdd, ram, os); 
		this.allInOne = allInOne;
	}
	
	//getter & setter
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	//information
	@Override
	public String information() {
		return super.information()+", "+this.allInOne;//this.allInOne == allInOne
	}
}
