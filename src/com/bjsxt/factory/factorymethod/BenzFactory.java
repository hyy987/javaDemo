package com.bjsxt.factory.factorymethod;

public class BenzFactory implements CreateCar{

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Benz();
	}

}
