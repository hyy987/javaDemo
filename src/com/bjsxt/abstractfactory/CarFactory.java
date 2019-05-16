package com.bjsxt.abstractfactory;

public interface CarFactory {

	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}
