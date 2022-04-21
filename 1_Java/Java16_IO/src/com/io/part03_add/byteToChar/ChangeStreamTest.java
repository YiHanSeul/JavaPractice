package com.io.part03_add.byteToChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ChangeStreamTest {
	public void input() {
		//Buffer Stream은 데이터를 한꺼번에 여러개씩 들고, 한꺼번에 전송 할 수 있도록 해 주는 임시 저장소이다.
		//InputStreamReader는 문자,바이트를 알아서 변역,변환 해주는 스트림
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //보조(보조(기반)) system.in콘솔창과 연결
		
		try {
			System.out.print("문자열 입력 : ");
			String val=br.readLine();
			
			System.out.println("val : "+val);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void output() {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out)); //system.out통로와 java와 연결
		try {
			bw.write("Java Gooooood~");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
