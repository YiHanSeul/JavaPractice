package com.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.test.dto.TestDto;

@Mapper
public interface TestMapper {
	
	@Select("SELECT * FROM TEST_DB") 
	List<TestDto> selectList();
	
	
	@Select(" SELECT * FROM MYBOARD WHERE MYNO= #{myno} ")
	TestDto selectOne(int myno);
	
	@Insert(" INSERT INTO TEST_DB VALUES( #{name},#{age}, #{addr}) ")
	int input(TestDto dto);

	@Update(" UPDATE MYBOARD SET MYNAME=#{myname},MYTITLE=#{mytitle}, MYCONTENT=#{mycontent} WHERE MYNO=#{myno}")
	int update(TestDto dto);

	@Delete(" DELETE FROM MYBOARD WHERE MYNO=#{myno} ")
	int delete(int myno);
	
}
