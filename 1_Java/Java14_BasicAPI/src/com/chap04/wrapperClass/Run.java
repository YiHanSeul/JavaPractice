package com.chap04.wrapperClass;

public class Run {
//Boxing
//UnBoxing
	public static void main(String[] args) {
		//boxing
		Integer i =new Integer(10);
		Double d=new Double(10.0);
		//autoBoxing
		Integer i2=5;
		Double d2=10.0;
		Short i3=10;
		
		//wrapper class-> 기본자료형
		int pi=i.intValue();
		double pd=d.doubleValue();
		
		//autoUnboxing
		int no =i2;
		double no2=d2;
		
		abox(pi+no); //int(pi+no) >>(autoBoxing)>>Integer>>(다형성)>>Object  >> int(abot(obj))
	
		byte b=Byte.parseByte("1");
		int i5=Integer.parseInt("4");
		long l=Long.parseLong("8");
		double d3=Double.parseDouble("0.4");
		
		i5=Integer.valueOf("4");
		d3=Double.valueOf("4.0");
		
		String sb=Byte.valueOf((byte)1).toString();
		String si=i2.toString();
		
		String sd=Double.valueOf(4.0).toString();
	}
	
	public static void abox(Object obj) {
		System.out.println((int)obj);
	}

}
