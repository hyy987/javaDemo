package com.bjsxt.abstractfactory;

public class LuxuyCarFactory implements CarFactory{

	@Override
	public Engine createEngine() {
		return new LuxuyEngine();
	}

	@Override
	public Seat createSeat() {
		return new LuxuySeat();
	}

	@Override
	public Tyre createTyre() {
		return new LuxuyTyre();
	}

}
