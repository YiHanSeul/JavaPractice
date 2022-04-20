package com.chap05.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Run {
	public static void main(String[] args) {
		//Date
		Date date1=new Date(0L);
		System.out.println(date1);
		
		Date today=new Date();
		System.out.println(today);
		
		//원하는 포맷으로 출력
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm");
		System.out.println(sdf.format(today));
		
		System.out.println("=====캘린더=====");
		//date 연산자와 다르게 new를 사용못해서 get으로 현재시간을 받아와야함.
		Calendar calendar=Calendar.getInstance();//현재시간
		System.out.println(calendar);
		calendar.set(2019, 9-1,9);
		
		int year=calendar.get(1);
		int month=calendar.get(Calendar.MONTH)+1;//month는 1적어서 +1해줘야함
		int date =calendar.get(Calendar.DATE);
		int hour=calendar.get(Calendar.HOUR);
		int min=calendar.get(Calendar.MINUTE);//static 필드라서 Calendar
		int sec=calendar.get(Calendar.SECOND);
		System.out.println(year+"년 "+month+"월 "+date+"일 "+hour+":"+min+":"+sec);
		System.out.println(calendar.getTime());//Date타입 객체로 변환해서 반환함.
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf1.format(calendar.getTime()));
		
		Calendar cal=(Calendar)calendar.clone();//obj타입의 객체를 리턴 근데 못함 왜냐하면 obj가 더 상위 클래스여서 그래서 형변환함.
		cal.add(Calendar.YEAR, -9);
		cal.add(Calendar.MONTH, -3);
		cal.add(Calendar.DATE,20);
		System.out.println(cal.getTime());
		
		System.out.println("====그레고리안====");
		GregorianCalendar gc=new GregorianCalendar();
		System.out.println(gc.getTime());
		
		System.out.println("year: "+gc.get(GregorianCalendar.YEAR));
		System.out.println("month: "+gc.get(Calendar.MONTH));
		System.out.println("date: "+gc.get(5));
		
		System.out.println(gc.isLeapYear(2020));
		
	}
}
