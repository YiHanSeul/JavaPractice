package com.test09;

public class SamsungTV implements TV {
	
	public SamsungTV() {
		System.out.println("samsung Tv��ü ����");
	}
	@Override
	public void powerOn() {
		System.out.println("samsung tv on");
	}

	@Override
	public void powerOff() {
		System.out.println("samsung tv off");
		
	}

	@Override
	public void volUp() {
		System.out.println("samsung tv vol up");
		
	}

	@Override
	public void volDown() {
		System.out.println("samsung tv vol down");
	}

}
