package com.mvc.upgrade.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.upgrade.model.dao.MemberDao;
import com.mvc.upgrade.model.dto.MemberDto;

public interface MemberService {
	
	public MemberDto login(MemberDto dto);
	
}
