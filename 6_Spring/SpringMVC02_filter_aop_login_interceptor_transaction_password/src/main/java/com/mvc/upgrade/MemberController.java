package com.mvc.upgrade;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.upgrade.model.dto.MemberDto;
import com.mvc.upgrade.model.service.MemberService;

@Controller
public class MemberController {
	
	private Logger logger=LoggerFactory.getLogger(MemberController.class); //logger객체를 가져옴
	
	
	@Autowired
	private MemberService service; //service로 넘겨줘야하기때문에 객체를 만들고 자동주입으로 Autowired를 해줌 
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder; //security-context.xml에 생성해둠
	@RequestMapping("/loginform.do")
	public String loginForm() {
		logger.info("LOGIN FORM");
		
		return "mvclogin";
	}
	
	
	//return은 보통 String으로 반환을해서 응답할 페이지였는데 ajax를 통한 비동기통신은 ajax에게 응답한다라고 생각해야함
	@RequestMapping(value="/ajaxlogin.do", method=RequestMethod.POST)
	@ResponseBody //json으로 다시 응답 할경우에 사용해줘야함
	public Map<String, Boolean> ajaxLogin(HttpSession session,@RequestBody MemberDto dto){ 		
		logger.info("LOGIN");
		
		//JSON으로 요청으로 데이터를 보낼때 @ReqeustBody어노테이션을 붙혀주면 MemberDto에 잘 변환되어서 dto에 잘들어온다 jackson을 통해서 처리됨
		//@RequestBody 는 자바객체로 바꾼다인데 지금 넘어온 데이터는 json이라서 jackson을 통해서 객체로 바꾼다.
		//@ReqseponseBody: java객체를 response시에 바인딩
		//System.out.println(dto.getMemberid());
		System.out.println(dto.getMemberid());
		System.out.println(dto.getMemberpw());
		MemberDto res=service.login(dto);
		
		boolean check=false;
		if(res!=null) { //로그인 성공
			if(passwordEncoder.matches(dto.getMemberpw(),res.getMemberpw())){//dto는 내가 로그인할때 입력한 원래비밀번호 res는 암호화된 비밀번호
				session.setAttribute("login", res); //해당 id만 일치하는게 있다면 session에 로그인 정보를 저장함
				check= true;
			}
		}
		System.out.println("check : "+check);
		Map<String,Boolean> map =new HashMap<String,Boolean>();
		map.put("check", check);
		return map;
	}
		@RequestMapping("/registerform.do")
		public String memberInsertForm() {
			logger.info("REGISTER FORM");
			return "mvcregister";
		}
		
		@RequestMapping("/register.do")
		public String memberInsert(MemberDto dto) {
			//String str =passwordEncoder.encode(dto.getMemberpw()); //변환 (암호화)
			//dto.setMemberpw(str); //인코딩한 pw를 다시 set해서 pw에 담는다
			dto.setMemberpw(passwordEncoder.encode(dto.getMemberpw()));
			System.out.println(dto.getMemberpw());
			
			int res=service.insert(dto);
			
			if(res>0) {
				return "redirect:loginform.do";
			}else {
				return "redirect:registerform.do";
			}
		}
}
