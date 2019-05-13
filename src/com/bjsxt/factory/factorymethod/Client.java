package com.bjsxt.factory.factorymethod;

public class Client {

	public static void main(String[] args) {
		AudiFactory af = new AudiFactory();
		Car c1 = af.createCar();
		Car c2 = new BydFactory().createCar();
		c1.run();
		c2.run();
		Car c3 = new BenzFactory().createCar();
		c3.run();
	}
}
