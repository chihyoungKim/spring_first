package edu.biz.aop1;


// target이 될
public class Hello implements HelloInter{
	// join point가 될
	public final void sayHello(){ 
		System.out.println("안녕");
	}
}
