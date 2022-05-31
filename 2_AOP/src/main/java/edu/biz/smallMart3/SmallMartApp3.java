package edu.biz.smallMart3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmallMartApp3 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("small3.xml");
		
		
		
		SmallMart mart = ctx.getBean("mart", SmallMart.class);
		
		try {

			mart.getProduct("전자제품");
			mart.getProduct2("생필품");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
