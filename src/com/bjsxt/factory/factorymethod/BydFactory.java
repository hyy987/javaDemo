package com.bjsxt.factory.factorymethod;

public class BydFactory implements CreateCar{

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Byd();
	}

}
