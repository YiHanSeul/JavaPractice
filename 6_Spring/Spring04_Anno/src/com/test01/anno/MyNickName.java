package com.test01.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //어노테이션을 붙여주면 해당 bean클래스는 자동으로 빈이 생성될 수 있게 된다.
public class MyNickName {
	@Autowired //자동으로 bean을 주입
	private NickName nickName;

	public NickName getNickName() {
		return nickName;
	}

	public void setNickName(NickName nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "nickName=" + nickName ;
	}
	

}
