package com.io.part03_add.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferStreamTest {
	public void fileSave() {
		
	/*	BufferedWriter bw=null; //bufferedWriter보조스트림 절대로 단독으로 못씀
		FileWriter fw=null;
		
		fw=new FileWriter("sample3.txt"); //기반스트림은 외부자원
		bw=new BufferedWriter(fw);*/
		
		BufferedWriter bw=null;
		try {
			bw=new BufferedWriter(new FileWriter("sample3.txt"));
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	public void fileOpen() {
		//butterReader 보조스트림
		 try(BufferedReader br=new BufferedReader(new FileReader("sample3.txt"));) {
			String tmp=null;
			
			while((tmp=br.readLine())!=null) {//한줄씩 라인별로 읽어옴. String값을 가지고오기때문에 null로 함 int면 -1
				System.out.println(tmp);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
