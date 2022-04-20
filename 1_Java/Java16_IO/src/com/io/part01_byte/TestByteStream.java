package com.io.part01_byte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
	public void fileSave() {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("sample.txt");//기반스트림안에는 외부자원 파일생성됨 outputStream이여서 외부로 출력하는 스트림
			
			fout.write(97); //write 작성
			byte[] bar= {98,99,100,101,102,10};
			fout.write(bar);
			fout.write(bar,1,3);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fout.close();// 연결된 스트림 무조건 닫아야함 자원이 한정적임
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
