package com.bjsxt.factory.factorymethod;

public class BenzFactory implements CreateCar{

	@Override
	public Car createCar() {
		return new Benz();
	}

}
