package com.test01;

import static common.JDBCTemplate.Close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class JDBCTest03 {
	//insert - MYTEST table
	public static void main(String[] args) throws SQLException {
		//준비
		Connection con=null;
		Statement stmt=null;
		
		
		// 키보드로 입력받아 MYTEST테이블에 ISNERT실행
		Scanner input =new Scanner(System.in);
		System.out.print("번호 입력:");
		int no=input.nextInt();
		System.out.print("이름 입력:");
		String name=input.next();
		System.out.print("별명입력:");
		String nickName=input.next();
		String sql="INSERT INTO MYTEST VALUES("+no+",'"+name+"','"+nickName+"')";
		
		con=getConnection();
		stmt=con.createStatement();
		int res=stmt.executeUpdate(sql);
		
		if(res>0) {
			System.out.println("insert 성공");
		}else {
			System.out.println("insert 실패");
		}
		Close(stmt);
		Close(con);
	}

}
