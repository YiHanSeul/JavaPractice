package com.test.service;

import java.util.List;

import com.test.dto.TestDto;

public interface TestService {
	public List<TestDto> selectList();
	public TestDto selectOne(int myno);
	public int input(TestDto dto);
}
