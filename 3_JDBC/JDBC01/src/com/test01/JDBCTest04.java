package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static common.JDBCTemplate.*;
public class JDBCTest04 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// preparedStatement는 statement의 자식 
		Connection con =null;
		PreparedStatement psmt=null;
		
		int no=0;
		String name=null;
		String nickName=null;
		
		String sql=" INSERT INTO MYTEST VALUES(?, ?, ?)";
		
		Scanner input =new Scanner(System.in);
		System.out.println("no : ");
		no=input.nextInt();
		System.out.println("name : ");
		name=input.next();
		System.out.println("nickName : ");
		nickName=input.next();
		
		//
		con=getConnection();
		psmt=con.prepareStatement(sql);// 일단 미완성된  ?가 들어가있는 sql을 넣는다.
		psmt.setInt(1,no); //첫번째 물음표에 no를 넣는다.
		psmt.setString(2, name);
		psmt.setString(3, nickName); 
		int res=psmt.executeUpdate();//?채워넣기 완료했으니 실행함 stmt는 바로 실행함.
		
		if(res>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		Close(psmt);
		Close(con);
		input.close();
		
		select();
	}
	
	public static void select() throws SQLException, ClassNotFoundException {
		// MYTEST 테이블로 부터 데이터를 읽어 화면에 출력
		Connection con=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		
		String sql=" SELECT * FROM MYTEST";
		
		con=getConnection();
		pstm=con.prepareStatement(sql);
		rs=pstm.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
		}
		Close(rs);
		Close(pstm);
		Close(con);
	}
}
