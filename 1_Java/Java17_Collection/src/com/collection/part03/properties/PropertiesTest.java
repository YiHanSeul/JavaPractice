package com.collection.part03.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public void test1() {
		
	//Properties Stirng밖에 못들어감.
	Properties prop=new Properties();
	
	prop.setProperty("id","Student");
	prop.setProperty("password","1234");
	System.out.println(prop);
	
	try {
		prop.store(new FileOutputStream("idpw.properties"), "id/pw");//바이트단위 저장
		prop.store(new FileWriter("idpw.txt"), "id/pw");//문자단위 저장
		prop.storeToXML(new FileOutputStream("driver.xml"),"id/pw");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void test2() {
		Properties prop=new Properties();
		try {
			//prop.load(new FileInputStream("idpw.properties")); //1. 파일 읽어오기
			//prop.load(new FileReader("idpw.txt"));
			prop.loadFromXML(new FileInputStream("driver.xml"));
			System.out.println(prop.getProperty("id")); ///2. load로 읽어온 파일 얻어오기
			System.out.println(prop.getProperty("password"));
			System.out.println(prop.getProperty("name"));
			
			prop.list(System.out);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
