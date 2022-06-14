package com.mvc.upgrade.common.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogAop {
	
	public void before(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget()+"");
		logger.info("-------AOP Start-------");
		Object[] args=join.getArgs();// 다오가 실행이 될때 넘어가는 파라미터값을 받아옴
		if(args!=null) {
			logger.info("method : "+join.getSignature().getName());
			for(int i=0; i<args.length;i++) {
				logger.info(i+"번째"+args[i]);
			}
		}
	}
	public void after(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget()+"");
		logger.info("-------AOP END-------");
	}
	public void afterThrowing(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget()+"");
		logger.info("------ERROR LOG------");
		logger.info("ERROR : "+join.getArgs());
		logger.info("ERROR : "+join.toString());
	}
}
