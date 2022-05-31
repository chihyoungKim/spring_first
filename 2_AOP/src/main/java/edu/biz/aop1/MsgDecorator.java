package edu.biz.aop1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MsgDecorator implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("전처리");
//		Object obj = invocation.getMethod().invoke(invocation.getThis(), invocation.getArguments());
		Object obj = invocation.proceed(); // 위아래내용이 같다?!?!@!?#!?@$?!?@
		System.out.println("후처리");
		return obj;
	}
	

}
