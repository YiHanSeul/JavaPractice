package com.io.part01_byte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
	public void fileSave() {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("sample.txt");//��ݽ�Ʈ���ȿ��� �ܺ��ڿ� ���ϻ����� outputStream�̿��� �ܺη� ����ϴ� ��Ʈ��
			
			fout.write(97); //write �ۼ�
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
				fout.close();// ����� ��Ʈ�� ������ �ݾƾ��� �ڿ��� ��������
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
