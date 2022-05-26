package com.my.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.my.dto.MyBoardDto;

public class MyBoardDao {
	Connection con=null;
	
	public MyBoardDao() {
		//드라이버 등록
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("01. Driver 연결");
		} catch (ClassNotFoundException e) {
			System.out.println("01. Driver 연결 실패");
			e.printStackTrace();
		}
	}
	public List<MyBoardDto> selectAll() {
		try {
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/multi","root","1234");
			System.out.println("02. 계정 연결");
		} catch (SQLException e) {
			System.out.println("02. 계정 연결 실패");
			e.printStackTrace();
		}
		Statement stmt=null;
		ResultSet rs=null;
		List<MyBoardDto> res=new ArrayList<MyBoardDto>();
		String sql = " SELECT * FROM MYBOARD ";
		
		try {
			stmt=con.createStatement();
			System.out.println("03. query 준비 "+sql);
			rs=stmt.executeQuery(sql);
			System.out.println("04. query 실행 및 리턴");
			while(rs.next()) {
				MyBoardDto dto=new MyBoardDto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5));
				res.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("03/04. query 준비 실패");
			e.printStackTrace();
			
		}finally {
			try {
				rs.close();
				stmt.close();
				con.close();
				System.out.println("05. db 종료\n");
			} catch (SQLException e) {
				System.out.println("05. db 종료 에러 \n");
				e.printStackTrace();
			}
		}
		return res;
	}
	
	//선택출력
	public MyBoardDto selectOne(int myno) {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/multi","root","1234");
			System.out.println("02. 계정 연결");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("02. 계정 연결 실패");
		}
		PreparedStatement pstm=null;
		ResultSet rs=null;
		MyBoardDto res=null;
		
		String sql=" SELECT * FROM MYBOARD WHERE MYNO=? ";
		try {
			pstm=con.prepareStatement(sql);
			pstm.setInt(1, myno);
			System.out.println("03. query준비 : "+ sql);
			rs=pstm.executeQuery();//쿼리준비했으니 실행
			System.out.println("04. query실행 및 리턴");
			
			if(rs.next()) {
				res=new MyBoardDto();
				res.setMyno(rs.getInt(1));
				res.setMyname(rs.getString(2));
				res.setMytitle(rs.getString(3));
				res.setMycontent(rs.getString(4));
				res.setMydate(rs.getDate(5));
			}
			
			
		} catch (SQLException e) {
			System.out.println("3/4단계 오류");
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstm.close();
				con.close();
				System.out.println("05. db종료 \n");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("05. db종료 오류\n");
			}
			
			
		}
		return res;
	}
	//추가
	public int insert(MyBoardDto dto) {
		try {
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/multi","root","1234");
			System.out.println("02. 계정 연결");
		} catch (SQLException e) {
			System.out.println("02. 계정 연결 실패");
			e.printStackTrace();
		}
		
		PreparedStatement pstm=null;
		int res= 0;
		
		String sql=" INSERT INTO MYBOARD VALUES(NULL,?,?,?,SYSDATE()) ";
		
		try {
			pstm=con.prepareStatement(sql);
			pstm.setString(1, dto.getMyname());
			pstm.setString(2, dto.getMytitle());
			pstm.setString(3, dto.getMycontent());
			System.out.println("03. query 준비: "+sql);
			res =pstm.executeUpdate();
			System.out.println("04. query 실행 및 리턴");
			
			
		} catch (SQLException e) {
			System.out.println("3/4단계 오류");
			e.printStackTrace();
		}finally {
			try {
				pstm.close();
				con.close();
				System.out.println("05 db 종료\n");
			} catch (SQLException e) {
				System.out.println("05 db 종료 오류\n");
				e.printStackTrace();
			}
		}
		return res;
	}
	
	public int update(MyBoardDto dto) {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/multi","root","1234");
			System.out.println("02. 계정 연결");
		} catch (SQLException e) {
			System.out.println("02. 계정 연결 실패");
			e.printStackTrace();
		}
		PreparedStatement pstm=null;
		int res=0;
		String sql=" UPDATE MYBOARD SET MYTITLE=?, MYCONTENT=? WHERE MYNO=?";
		try {
			pstm=con.prepareStatement(sql);
			pstm.setString(1, dto.getMytitle());
			pstm.setString(2, dto.getMycontent());
			pstm.setInt(3, dto.getMyno());
			System.out.println("03. query 준비: "+ sql);
			res=pstm.executeUpdate();
			System.out.println("04. query 실행 및 리턴");
		} catch (SQLException e) {
			System.out.println("3/4단계 오류");
			e.printStackTrace();
		}finally {
			try {
				pstm.close();
				con.close();
				System.out.println("05 db 종료\n");
			} catch (SQLException e) {
				System.out.println("05 db 종료 오류\n");
				e.printStackTrace();
			}
		}
		return res;
	}
	
	public int delete(int myno) {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/multi","root","1234");
			System.out.println("02. 계정 연결");
		} catch (SQLException e) {
			System.out.println("02. 계정 연결 실패");
			e.printStackTrace();
		}
		PreparedStatement pstm=null;
		int res=0;
		String sql=" DELETE FROM MYBOARD WHERE MYNO=? ";
		
		try {
			pstm=con.prepareStatement(sql);
			pstm.setInt(1, myno);
			System.out.println("03. query 준비: "+ sql);
			res=pstm.executeUpdate();
			System.out.println("04. query 실행 및 리턴");
		} catch (SQLException e) {
			System.out.println("3/4단계 오류");
			e.printStackTrace();
		}finally {
			try {
				pstm.close();
				con.close();
				System.out.println("05 db 종료\n");
			} catch (SQLException e) {
				System.out.println("05 db 종료 오류\n");
				e.printStackTrace();
			}
		}
		 
		return res;
	}
}
