package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class MyServer {
	public static void main(String[] args) throws IOException {
		//서버 생성(소켓만들기)
		DatagramSocket ds=new DatagramSocket(9999); //서버안에 패킷을 만들고 포트번호는 9999임
		System.out.println("서버");
		
		//받을 배열 생성
		byte[] buff=new byte[1024];
		
		//패킷을 받음
		DatagramPacket receiveP=new DatagramPacket(buff,buff.length); 
		
		//넘어오는 패킷을 저장함
		ds.receive(receiveP);
		System.out.println(new String(receiveP.getData()));
		
		//종료
		ds.close();
		ds.disconnect();
	}
}
