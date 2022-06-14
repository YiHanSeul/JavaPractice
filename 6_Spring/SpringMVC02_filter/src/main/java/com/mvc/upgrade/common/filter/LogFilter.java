package com.mvc.upgrade.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFilter implements Filter{
	//logger 객체 생성 slf4j import하기
	private Logger logger=LoggerFactory.getLogger(LogFilter.class);
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req=(HttpServletRequest)request;
		
		String remoteAddr= req.getRemoteAddr();
		String uri=req.getRequestURI();
		String url=req.getRequestURL().toString(); //String buffer여서 toString으로 바꿔줘야함.
		String queryString=req.getQueryString();
		String referer =req.getHeader("referer");
		String agent = req.getHeader("User-Agent");
		
//		logger.info("remoteAddr"+remoteAddr);
//		logger.info("uri : "+uri);
//		logger.info("url : "+url);
//		logger.info("query String : "+queryString);
//		logger.info("referer : "+referer);
//		logger.info("agent : "+agent);
		String str=remoteAddr+"\n"+uri+"\n"+url+"\n"+queryString+"\n"+referer+"\n"+agent;
		logger.info("LOG FILTER\n"+str);
		
		//결과가 끝나면 다음필터로 넘겨줘야함 계속해서 필터로 chain으로 연결하여 넘겨주고 마지막 필터에서는  servlet으로 가야함.
		chain.doFilter(req, response);
	}

	@Override
	public void destroy() {
		
	}

}
