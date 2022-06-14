package com.mvc.upgrade;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.upgrade.model.dto.MemberDto;
import com.mvc.upgrade.model.service.MemberService;

@Controller
public class MemberController {
	
	private Logger logger=LoggerFactory.getLogger(MemberController.class); //logger객체를 가져옴
	
	@Autowired
	private MemberService service; //service로 넘겨줘야하기때문에 객체를 만들고 자동주입으로 Autowired를 해줌 
	
	@RequestMapping("/loginform.do")
	public String loginForm() {
		logger.info("LOGIN FORM");
		
		return "mvclogin";
	}
	
	@RequestMapping(value="/ajaxlogin.do", method=RequestMethod.POST)
	public Map<String, Boolean> ajaxLogin(HttpSession session,@RequestBody MemberDto dto){ 		
		logger.info("LOGIN");
		
		//JSON으로 요청으로 데이터를 보낼때 @ReqeustBody어노테이션을 붙혀주면 MemberDto에 잘 변환되어서 dto에 잘들어온다 jackson을 통해서 처리됨
		//@RequestBody 는 자바객체로 바꾼다인데 지금 넘어온 데이터는 json이라서 jackson을 통해서 객체로 바꾼다임
		//System.out.println(dto.getMemberid());
		
		MemberDto res=service.login(dto);
		return null;
	}
}
