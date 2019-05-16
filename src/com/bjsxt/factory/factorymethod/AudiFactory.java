package com.bjsxt.factory.factorymethod;

public class AudiFactory implements CreateCar{

	@Override
	public Car createCar() {
		return new Audi();
	}

}
