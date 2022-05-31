package edu.biz.ioc2;

public class HyundaiMaker implements CarMaker{
	public Car sell(Money money) {
		return new Car("sonata");
	}
}
