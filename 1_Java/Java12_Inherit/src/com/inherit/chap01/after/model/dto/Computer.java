package com.inherit.chap01.after.model.dto;

import java.util.Date;

public class Computer extends Product{
	private String cpu;
	private int hdd;
	private int ram;
	private String os;
	
	//생성자(기본, 매개변수)
	public Computer() {
		super(); //자기의 부모 클래스의 생성자를 호출하는것 public Product(){} 부모먼저 만들고 자식을 만들어라
	}

	public Computer(String brand, String productNumber, String productCode, String productName, int price, Date date,
			String cpu, int hdd, int ram, String os) {
		super(brand, productNumber, productCode, productName, price, date);//매개변수있는 부모클래스생성자의 값을 가지와서 초기화함. 
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.os = os;
	}
	
	//getter & setter
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	
	@Override
	public String information() { //부모의 information을 물려받았지만 내맘대로 바꿔씀
		//super.information()은 부모메서드를 들고옴
		return super.information()+", "+ cpu+", "+hdd+", "+ram+", "+os;
	}

	
}
