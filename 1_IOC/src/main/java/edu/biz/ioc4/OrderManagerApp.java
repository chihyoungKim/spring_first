package edu.biz.ioc4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderManagerApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ioc4.xml");
		OrderManager manager = ctx.getBean("orderManager", OrderManager.class);
		//getBean으로 가져온게 컨텍스트화된 의존성 룩업이다.
		System.out.println(manager);
		System.out.println(manager);
		System.out.println(manager);
		System.out.println(manager);
		System.out.println(manager);
		manager.order();
		ctx.close();
	}
}
