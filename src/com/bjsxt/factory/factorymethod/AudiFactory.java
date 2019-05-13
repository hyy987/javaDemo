package com.bjsxt.factory.factorymethod;

public class AudiFactory implements CreateCar{

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}

}
