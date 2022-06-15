package com.mvc.upgrade.common.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{
	
	private Logger logger =LoggerFactory.getLogger(LoginInterceptor.class);
	//Controller가 실행되기 이전에 실행 false로 return을 하면 controller로 안넘어감
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
		logger.info("[interceptor] : preHandle");
		
		//loginform.do,ajaxlogin.do,로그인 session값이 null이 아닐때 컨트롤러로 넘겨줌
		if(request.getRequestURI().contains("/loginform.do")
				|| request.getRequestURI().contains("/ajaxlogin.do")
				|| request.getSession().getAttribute("login")!=null
				|| request.getRequestURI().contains("/test.do")
				|| request.getRequestURI().contains("/registerform.do")
				|| request.getRequestURI().contains("/register.do")) {
			return true;
		}
		//로그인이 안됐을경우
		if(request.getSession().getAttribute("login")==null) {
			response.sendRedirect("loginform.do");
			return false;
		}
		return false;
	}
	
	//view단으로 forward 되기 전에 실행
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
		logger.info("[interceptor] : postHandle");
		
	}
	
	//view까지 처리가 끝난후 실행
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) {
		logger.info("[interceptor] : afterCompletion");
	}
}
