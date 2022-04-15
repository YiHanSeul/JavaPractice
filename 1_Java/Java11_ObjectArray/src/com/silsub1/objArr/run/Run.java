package com.silsub1.objArr.run;

import com.silsub1.objArr.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
		//°¢°¢ ´Ù¸¥ 3°³ÀÇ °´Ã¼°¡ ¸¸µé¾îÁü
		Student st1= new Student(3,1,1,"È«±æµ¿");
		Student st2= new Student(4,3,2,"À¯°ü¼ø");
		Student st3= new Student(2,7,5,"À±ºÀ±æ");
		
		Student[] atArr=new Student[3];
		atArr[0]=st1;
		atArr[1]=st2;
		atArr[2]=st3;
		
		for(int i =0; i<atArr.length;i++) {
			System.out.println(atArr[i].information());
		}
	}
	
}
