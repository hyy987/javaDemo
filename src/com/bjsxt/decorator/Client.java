package com.bjsxt.decorator;

public class Client {
	
	public static void main(String[] args) {
		Car car = new Car();
		SuperCar sc =new SuperCar(new FlyCar(new AICar(car)));
		sc.move();
		
		
	}
	
}
