package edu.biz.smallMart2;

import java.lang.reflect.Method;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import edu.biz.smallMart.advice.BeforeLog;

public class SmallMartApp {
	public static void main(String[] args) {
		SmallMart mart1 = new SmallMartImpl();
		
		
		ProxyFactory pf = new ProxyFactory();
		
		
		pf.addAdvisor(new DefaultPointcutAdvisor(new StaticMethodMatcherPointcut() {
			@Override
			public boolean matches(Method method, Class<?> targetClass) {
				return method.getName().endsWith("2");
			}
		}, new BeforeLog()));
		
		pf.setTarget(mart1);
		
		SmallMart mart2 = (SmallMart) pf.getProxy();
		
		try {
			mart2.getProduct("전자제품");
			mart2.getProduct("생필품");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
