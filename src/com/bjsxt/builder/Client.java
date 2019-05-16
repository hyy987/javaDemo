package com.bjsxt.builder;

public class Client {

	public static void main(String[] args) {
		AirShipDirector ad = new SxtAirShipDirector(new SxtAirShipBuilder());
		AirShip airShip = ad.directAirShip();
		System.out.println(airShip.getEscapeTower().getName());
		airShip.launch();
	}
}
