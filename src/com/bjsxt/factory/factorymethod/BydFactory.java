package com.bjsxt.factory.factorymethod;

public class BydFactory implements CreateCar{

	@Override
	public Car createCar() {
		return new Byd();
	}

}
