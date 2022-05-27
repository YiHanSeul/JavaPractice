package com.mul.dao;

import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static common.JDBCTemplate.*;
import com.mul.dto.BoardDto;
public class BoardDao {
	
	public List<BoardDto> selectAll(){
		Connection con=getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		
		List<BoardDto> res=new ArrayList<>();
		
		String sql=" SELECT * FROM MDBOARD";
		
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				BoardDto tmp=new BoardDto();
				tmp.setSeq(rs.getInt(1));
				tmp.setWriter(rs.getString(2));
				tmp.setTitle(rs.getString(3));
				tmp.setContent(rs.getString(4));
				tmp.setDate(rs.getDate(5));
				
				res.add(tmp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return res;
	}
	
	public BoardDto selectOne(int seq) {
		Connection con =getConnection();
		PreparedStatement pstm=null;
		ResultSet rs=null;
		BoardDto res=new BoardDto();
		
		String sql=" SELECT * FROM MDBOARD WHERE SEQ=? ";
		try {
			pstm=con.prepareStatement(sql);
			pstm.setInt(1, seq);
			rs=pstm.executeQuery();
			
			if(rs.next()) {
				res.setSeq(rs.getInt(1));
				res.setWriter(rs.getString(2));
				res.setTitle(rs.getString(3));
				res.setContent(rs.getString(4));
				res.setDate(rs.getDate(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstm);
			close(con);
		}
		
		return res;
	}
	
	public int insert() {
		return 0;
	}
	
	public int update() {
		return 0;
	}
	
	public int delete() {
		return 0;
	}
	
	public int deleteChk(String[] seq) {
		Connection con=getConnection();
		PreparedStatement pstm=null;
		int res=0;
		int[] cnt=null;
		
		String sql=" DELETE FROM MDBOARD WHERE SEQ=? ";
		
		try {
			pstm=con.prepareStatement(sql);
			for(int i=0; i<seq.length; i++) {
				pstm.setString(1, seq[i]);
				pstm.addBatch();
			}
			cnt=pstm.executeBatch();
			
			for(int i=0; i<cnt.length;i++) {
				if(cnt[i]==1) {
					res++;
				}
			}
			if(seq.length==res) {
				commit(con);
			}else {
				rollback(con);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstm);
			close(con);
		}
		
		return res;
	}
}
