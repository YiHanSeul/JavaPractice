package com.model.biz;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import com.model.dao.MyTestDao;
import com.model.dto.MyTest;
public class MyTestBiz {
	MyTestDao dao = new MyTestDao();
		
	public List<MyTest> getAll() {
		Connection con = getConnection();
		List<MyTest> list = dao.getAll(con);
		Close(con);
		return list;
	}

	public int insert(MyTest dto) {
		Connection con = getConnection();		
		
		int res = dao.insert(con, dto);
		
		if(res>0) {
			Commit(con);
		}else {
			Rollback(con);
		}
		Close(con);
		return res;
	}

	public int update(MyTest updateDto) {
		Connection con = getConnection();
		int res = dao.update(con, updateDto);
		if(res>0) {
			Commit(con);
		}else {
			Rollback(con);
		}
		Close(con);
		return res;
	}

	public int delete(int del) {
		Connection con = getConnection();
		int res = dao.delete(con, del);
		if(res>0) {
			Commit(con);
		}else {
			Rollback(con);
		}
		Close(con);
		return res;
	}

	public MyTest selectOne(int selNo) {
		Connection con = getConnection();
		MyTest res = dao.selectOne(con, selNo);
		Close(con);
		return res;
	}

}
