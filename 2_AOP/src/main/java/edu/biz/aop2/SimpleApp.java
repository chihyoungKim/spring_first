package edu.biz.aop2;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import edu.biz.smallMart.advice.ArroundLog;
import edu.biz.smallMart.advice.BeforeLog;

public class SimpleApp {
	public static void main(String[] args) {
		First first = new First();
		Second second = new Second();
		
		
		ProxyFactory pf = new ProxyFactory();
//		pf.addAdvice(new ArroundLog());
		pf.addAdvisor(new DefaultPointcutAdvisor(new SimplePointcut(), new BeforeLog()));
		pf.setTarget(first);
		
		First first2 = (First) pf.getProxy();
		
		pf = new ProxyFactory();
		pf.addAdvice(new BeforeLog());
//		pf.addAdvisor(new DefaultPointcutAdvisor(new SimplePointcut(), new ArroundLog()));
		pf.setTarget(second);
		
		Second second2 = (Second) pf.getProxy();
		
		first2.one();
		first2.two();
		second2.one();
		second2.two();
		
	}
}
