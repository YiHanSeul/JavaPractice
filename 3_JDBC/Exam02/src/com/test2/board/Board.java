package com.test2.board;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Board {
	private int no;
	private String title;
	private String writer;
	private String content;
	private Date regdate;
	
	public Board() {
		super();
	}
	
	public Board(int no, String title, String writer, String content, Date regdate) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regdate = regdate;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regdate="
				+ regdate + "]";
	}
	
	//DB연결
	public static Connection connect()  {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("DB 드라이버등록 실패");
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/multi";
		String id="root";
		String pw="1234";
		Connection con=null;
		try {
			con=DriverManager.getConnection(url,id,pw);
			con.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("커넥션 연결 실패");
			e.printStackTrace();
		}
	
		return con;
	}
	
	//DB Close
	public static void Close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Close(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			System.out.println("커밋 실패");
			e.printStackTrace();
		}
	}
	
	private void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			System.out.println("롤백 실패");
			e.printStackTrace();
		}
	}
	
	public void selectAll() {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String sql=" Select * from BOARD ";
		
		con=connect();
		try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			System.out.println("stmt오류");
			e.printStackTrace();
		}
		try {
			rs=stmt.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("쿼리오류");
			e.printStackTrace();
		}
		try {
				while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "
				+rs.getString(3)+" "+rs.getString(4)+" " +rs.getString(5));
				}
		} catch (SQLException e) {
			System.out.println("데이터가 없습니다.");
			e.printStackTrace();
		}finally {
			Close(rs);
			Close(stmt);
			Close(con);
		}
		
		
	}

	public void insert() {
		Connection con =null;
		PreparedStatement pstm=null;
		int res=0;
		
		Scanner input=new Scanner(System.in);
		System.out.print("번호입력 :");
		int no=input.nextInt();
		System.out.print("제목입력 :");
		String title=input.next();
		System.out.print("저자입력 :");
		String writer=input.next();
		System.out.print("내용입력 :");
		String content=input.next();
		String sql=" INSERT INTO BOARD VALUES(?, ?, ?, ?, NOW()) ";
		con=connect();
		try {
			pstm=con.prepareStatement(sql);
			pstm.setInt(1, no);
			pstm.setString(2, title);
			pstm.setString(3, writer);
			pstm.setString(4, content);
			
			res=pstm.executeUpdate();
			if(res>0) {
				commit(con);
			}else {
				rollback(con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Close(pstm);
			Close(con);
		}
		
		
	}

	
}
