package com.io.part01_byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {

	// outputStream
	public void fileSave() {

		FileOutputStream fout = null; //메소드 전체에서 사용할수있게 null을 그냥 넣어주고 초기에 선언해줌. try문안에 들어가면 finally에 close에서 사용못함 지역변수
		try {
			fout = new FileOutputStream("sample.txt");// 기반스트림안에는 외부자원 파일생성됨 outputStream이여서 외부로 출력하는 스트림

			fout.write(97); // write 작성
			byte[] bar = { 98, 99, 100, 101, 102, 10 };
			fout.write(bar);
			fout.write(bar, 1, 3);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fout.close();// 연결된 스트림 무조건 닫아야함 자원이 한정적임
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// inputStream
	public void fileOpne() {
		FileInputStream fin = null; //메소드 전체에서 사용할수있게 null을 그냥 넣어주고 초기에 선언해줌. try문안에 들어가면 finally에 close에서 사용못함 지역변수

		try {
			fin = new FileInputStream("sample.txt"); // 기반스트림 생성자안에는 외부자원
			
			//1
			/*int fileSize = (int) new File("sample.txt").length(); // sample.txt바이트 수를 구함

			byte[] bar = new byte[fileSize];// 바이트 수를 구한 수 만큼 bar배열에 담는다.
			fin.read(bar);
			for (int i = 0; i < bar.length; i++) {
				System.out.print((char)bar[i] + " ");
			}*/
			
			//2
			int val=0; //val=0을 해서 fin.read에 넣어준이유fin.read()를 함과 동시에 다음으로 넘어가서 이상하게 출력됨. 그래서 그냥 대입을함
			while((val=fin.read()) !=-1) {//read를 실행하다가 -1을 return할때가 있음. 그때는 더이상 읽을 데이터가 없다.
				System.out.print((char)val+" ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen2() {
		
		try (FileInputStream fin=new FileInputStream("sample.txt")){
			
			int size= (int)new File("sample.txt").length();
			byte[] bar=new byte[size];
			fin.read(bar);
			
			for(int i=0; i<bar.length; i++) {
				System.out.println(bar[i]+ " ");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
