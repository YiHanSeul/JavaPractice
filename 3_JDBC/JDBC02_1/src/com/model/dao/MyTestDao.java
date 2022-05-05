package com.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.dto.MyTest;

import static common.JDBCTemplate.*;

public class MyTestDao {
	private Connection con;
	public MyTestDao() {}
	public MyTestDao(Connection con) {
		super();
		this.con = con;
	}
	
	//selectAll
	public List<MyTest> getAll(Connection conn){
		Statement stmt = null;
		ResultSet rs = null;
		List<MyTest> my = new ArrayList<MyTest>();
		String sql = " SELECT * FROM MYTEST ";
		
		try {
			stmt =conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				MyTest tmp = new MyTest(rs.getInt(1), rs.getString(2), rs.getString(3));
				my.add(tmp);
			}
			
		} catch (SQLException e) {
			System.out.println("[ERROR] select");
			e.printStackTrace();
		}
		
		return my;
	}
	//insert
	public int insert(Connection conn, MyTest input) {
		PreparedStatement pstm = null;
		int res = 0;
		
		String sql = " INSERT INTO MYTEST VALUES(?,?,?) ";
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, input.getMno());
			pstm.setString(2, input.getMname());
			pstm.setString(3, input.getNickname());
			
			res = pstm.executeUpdate();

		} catch (SQLException e) {
			System.out.println("[ERROR] insert");
			e.printStackTrace();
		}
		
		return res;
	}
	//update
	public int update(Connection conn, MyTest input) {
		// UPDATE MYTEST SET MNAME=?, NICKNAME=? WHERE MNO=?
		PreparedStatement pstm = null;
		int res = 0;
		String sql = " UPDATE MYTEST SET MNAME=?, NICKNAME=? WHERE MNO=? ";
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, input.getMname());
			pstm.setString(2, input.getNickname());
			pstm.setInt(3, input.getMno());
			
			res = pstm.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	//delete
	public int delete(Connection conn, int no) {
		// DELETE FROM MYTEST WHERE MNO=?
		PreparedStatement pstm = null;
		int res = 0;
		String sql = " DELETE FROM MYTEST WHERE MNO=? ";
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, no);
			
			res = pstm.executeUpdate();
			if(res>0) {
				Commit(con);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	//selectOne
	public MyTest selectOne(Connection con,int no) {
		// select * from mytest where mno=?
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
