package edu.biz.smallMart2;

import java.lang.reflect.Method;

import org.springframework.aop.Pointcut;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import edu.biz.smallMart.advice.BeforeLog;

public class SmallMartApp2 {
	public static void main(String[] args) {
		SmallMart mart1 = new SmallMartImpl();
		
		
		ProxyFactory pf = new ProxyFactory();
		
		
		AspectJExpressionPointcut apc = new AspectJExpressionPointcut(); // 가장많이사용한다.
		// aspectJ Expression
		apc.setExpression("execution(* *2(..))"); // 표현식 문구 자체를 눈에 익혀두라
		pf.setTarget(mart1);
		
		pf.addAdvisor(new DefaultPointcutAdvisor(apc, new BeforeLog()));
		pf.setTarget(mart1);
		
		
		SmallMart mart2 = (SmallMart) pf.getProxy();
		
		try {
			mart2.getProduct("전자제품");
			mart2.getProduct2("생필품");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
