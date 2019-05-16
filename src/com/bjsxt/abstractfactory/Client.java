package com.bjsxt.abstractfactory;

public class Client {

	public static void main(String[] args) {
		CarFactory cf1= new LuxuyCarFactory();
		Seat seat = cf1.createSeat();
		seat.massage();
	}
}
