package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static common.JDBCTemplate.*;

public class JDBCTest02_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 준비
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null; //특이한 데이터타입이여서 close를 해줘야함.
		
		String sql=" SELECT * FROM DEPARTMENT";
		// 1.Driver 등록
		//2. DBMS연결 CONNECTION객체 생성
		con=getConnection(); //static 메소드여서 import할때도 static 붙임.
		//3.
		stmt=con.createStatement();
		//4.
		rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString("LOCATION_ID"));
		}
		
		//5.
		Close(rs);
		Close(stmt);
		Close(con);
	}
}
