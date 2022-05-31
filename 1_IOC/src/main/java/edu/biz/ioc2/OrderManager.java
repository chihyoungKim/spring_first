package edu.biz.ioc2;

public class OrderManager {
	private CarMaker maker;
	
	public OrderManager() {
		maker = new DaewooMaker();
	}
	public void order() {
		Money money = new Money(1000);
		Car car = maker.sell(money);
		System.out.println("I sold a car :: " + car.getName() + ", " + money.getAmount());
	}
}
