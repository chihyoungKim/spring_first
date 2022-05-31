package edu.biz.smallMart;

import org.springframework.aop.framework.ProxyFactory;

import edu.biz.smallMart.advice.AfterRetLog;
import edu.biz.smallMart.advice.ArroundLog;
import edu.biz.smallMart.advice.BeforeLog;
import edu.biz.smallMart.advice.ThrowsLog;

public class SmallMartApp {
	public static void main(String[] args) {
		SmallMart mart1 = new SmallMartImpl();
		
		try {
			mart1.getProduct("생필품");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("==");
		System.out.println("==================================");
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new ArroundLog());
		// 어라운드가 제일 먼저 들어가있으면 나올때도 제일 마지막
		pf.addAdvice(new AfterRetLog());
		pf.addAdvice(new BeforeLog());
		pf.addAdvice(new ThrowsLog());
		pf.setTarget(mart1);
		
		SmallMart mart2 = (SmallMart) pf.getProxy();
		
		try {
			mart2.getProduct("전자제품");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
