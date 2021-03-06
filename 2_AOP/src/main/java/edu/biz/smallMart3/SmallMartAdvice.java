package edu.biz.smallMart3;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class SmallMartAdvice {
	
	public void before(JoinPoint joinPoint) {
		
		System.out.println("사전 :: " + joinPoint.getSignature().getName());
	}
	
	public void adv() {
		System.out.println("사전2");
	}
	
	public void logging(JoinPoint jp) {
		System.out.printf("[%s.%s(%s) :: %s] - ",
				jp.getTarget().getClass().getName(),
				jp.getSignature().getName(),
				Arrays.toString(jp.getArgs()),
				new SimpleDateFormat("yyyy-MM-dd hh:mma").format(System.currentTimeMillis()));
	}
}
