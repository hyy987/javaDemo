package com.bjsxt.factory.simmplefactory;

public class CarFatory2 {

	public static Car createAudi() {
			return new Audi();
	}
	
	public static Car createByd() {
		return new Byd();
	}
}
