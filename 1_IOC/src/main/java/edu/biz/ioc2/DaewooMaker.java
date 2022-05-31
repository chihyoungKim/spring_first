package edu.biz.ioc2;

public class DaewooMaker implements CarMaker{
	public Car sell(Money money) {
		return new Car("tosca");
	}
}
