package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dto.TestDto;
import com.test.mapper.TestMapper;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	private TestMapper mapper;
	
	@Override
	public List<TestDto> selectList() {

		return mapper.selectList();
	}

	@Override
	public TestDto selectOne(int myno) {
		
		return mapper.selectOne(myno);
	}

	@Override
	public int input(TestDto dto) {
		return mapper.input(dto);
	}

}
