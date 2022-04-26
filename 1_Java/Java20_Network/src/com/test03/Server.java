package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
//tcp통신
public class Server {
	public static void main(String[] args) {
		//서버 생성 : 클라이언트한테 요청을 받음
		ServerSocket serverSocket=null;
		
		//실제로 연결이될 소켓 : 클라이언트한테 연결할 개체
		//접속된 클라이언트 소켓
		Socket serviceSocket=null;
		
		//출력개체
		PrintWriter out=null;
		
		BufferedReader in=null;
		
		//요청을 기다림
		try {
			serverSocket=new ServerSocket(8888);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println("Client를 기다립니다.");
			try {
				//받아드리면서 서버를 통신하는 소켓이 연결이됨.
				serviceSocket=serverSocket.accept();
				System.out.println("client가 접속했습니다.");
				
				//client에게 받은 내용을 라인단위로 읽음
				//바이트와 문자라서 안맞기때문에 보조스트림으로 맞춰주고 연결함.
				in=new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
				
				//잘받았다라고 다시 보내 주겠다.
				//output은 따로 보조스트림으로 안맞춰 줘도됨.
				out=new PrintWriter(serviceSocket.getOutputStream(),true);
				
				String inputLine=null;
				while((inputLine=in.readLine())!=null) {//readLine으로 내용을 읽어옴
					//읽어온 내용을 한줄씩 출력
					System.out.println("클라이언트가 보낸 메시지 "+inputLine);
					//printWriter는 read말고 print그냥 써주면됨.
					out.println(inputLine+" 잘받았어");
					}
				out.close();
				in.close();
				serviceSocket.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

