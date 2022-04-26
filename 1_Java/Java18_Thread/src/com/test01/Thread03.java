package com.test01;

public class Thread03 {

	public static void main(String[] args) {
		MyThread02 m1=new MyThread02("æﬂøÀ");
		MyThread02 m2=new MyThread02("∏€∏€");
		
		long start=System.currentTimeMillis();
		m1.start();
		try {
			//m1 Thread∞° ¡æ∑·µ…∂ß ±Ó¡ˆ ¥Ÿ∏• Thread∏¶ ∏ÿ√·¥Ÿ.
			m1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m2.start();
		long end=System.currentTimeMillis();
		System.out.println("Ω««‡Ω√∞£: "+(end-start));
	}

}
