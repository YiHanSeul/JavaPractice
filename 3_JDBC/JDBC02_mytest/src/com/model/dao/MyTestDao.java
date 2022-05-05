package com.model.dao;

import static common.JDBCTemplate.Commit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.dto.MyTest;
// 실제 기능구현
public class MyTestDao {
	private Connection con; //db연결하는 필드 class안에 선언
	
	public MyTestDao(Connection con) {
		super();
		this.con=con; //다오 생성자가 만들어지면서 필드의 con이 채워져서 사용가능함.
	}
	//SELECT 
	public List<MyTest> getAll(){
		Statement stmt=null; //쿼리문실행 변수
		ResultSet rs=null; //쿼리실행후 결과를 담을 변수
		List<MyTest> my=new ArrayList<MyTest>(); // 결과를 리스트에 옮겨담을 변수
		String sql="SELECT * FROM MYTEST";
		
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				MyTest tmp=new MyTest(rs.getInt(1),rs.getString(2),rs.getString(3));
				my.add(tmp);
			}
		} catch (SQLException e) {
			System.out.println("[ERROR] SELECT");
			e.printStackTrace();
		}
		return my;
	}
	//INSERT
	public int insert(MyTest input) {
		PreparedStatement pstm=null;
		int res=0;
		String sql="INSERT INTO MYTEST VALUES(?,?,?)";
		try {
			pstm=con.prepareStatement(sql);
			pstm.setInt(1, input.getMno());
			pstm.setString(2, input.getMname());
			pstm.setString(3, input.getNickname());
			
			res=pstm.executeUpdate();
			if(res>0) {
				Commit(con); //insert성공시에 바로 commit을 해서 다른 툴로 접속을 해도 바로 확인할 수 있음.
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	//UPDATE
	public int update(MyTest input) {
		//UPDATE MYTEST SET MNAME=?, NICKNAME=? WHERE MNO=?
		PreparedStatement pstm=null;
		int res=0;
		String sql="UPDATE MYTEST SET MNAME=?,NICKNAME=? WHERE MNO=?";
		try {
			pstm=con.prepareStatement(sql);
			pstm.setInt(3, input.getMno());
			pstm.setString(1, input.getMname() );
			pstm.setString(2, input.getNickname());
			
			res=pstm.executeUpdate();
			if(res>0) {
				Commit(con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	//DELETE
	public int delete(int no) {
		//DELETE FROM MYTEST WHERE MNO=?
		
		PreparedStatement pstm=null;
		int res=0;
		String sql="DELETE FROM MYTEST WHERE MNO=?";
		try {
			pstm=con.prepareStatement(sql);
			pstm.setInt(1, no);
			
			res=pstm.executeUpdate();
			
			if(res>0){
				Commit(con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}
	public MyTest selectOne(int selNo) {
		// select * from mytest where mno=?
		PreparedStatement pstm=null;
		ResultSet rs=null;
		MyTest res=new MyTest(); // 결과를 리스트에 옮겨담을 변수
		String sql="SELECT * FROM MYTEST WHERE MNO=?";
		try {
			pstm=con.prepareStatement(sql);
			pstm.setInt(1, selNo);
			rs=pstm.executeQuery();
			if(rs.next()) {
				res=new MyTest(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
}
