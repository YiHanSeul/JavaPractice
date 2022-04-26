package com.test01;

public class Thread04 {

	public static void main(String[] args) {
		for(int i=0; i<50;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("¢¾ ");
		}
	}

}
