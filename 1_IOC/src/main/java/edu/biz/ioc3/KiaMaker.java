package edu.biz.ioc3;

public class KiaMaker implements CarMaker{
	private Car car;
	
	public void setCar(Car car) {
		this.car = car;
	}

	public Car sell(Money money) {
		return car;
	}
}
