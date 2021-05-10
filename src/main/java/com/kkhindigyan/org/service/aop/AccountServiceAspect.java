package com.kkhindigyan.org.service.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;

import com.kkhindigyan.org.model.Account;

public class AccountServiceAspect {

	private static Log log =  LogFactory.getLog(AccountServiceAspect.class.getName());
	
	public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		log.info("Before Method:"+proceedingJoinPoint.getSignature());
		
		try {
			Object object = proceedingJoinPoint.proceed();
			if( object instanceof Account) {
				System.out.println((Account)object);
			}
		} catch (Throwable e) {
			log.error("There is an exception :"+e.toString());
		}
		log.info("After Method:"+proceedingJoinPoint.getSignature());
	}
}
