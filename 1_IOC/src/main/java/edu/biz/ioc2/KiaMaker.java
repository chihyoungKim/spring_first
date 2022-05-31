package edu.biz.ioc2;

public class KiaMaker implements CarMaker{
	public Car sell(Money money) {
		return new Car("k5");
	}
}
