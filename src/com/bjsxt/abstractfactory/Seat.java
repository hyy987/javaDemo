package com.bjsxt.abstractfactory;

public interface Seat {

	void massage();
}

class LuxuySeat implements Seat {

	@Override
	public void massage() {
		System.out.println("能按摩，很舒服");

	}

}
class LowSeat implements Seat {
	
	@Override
	public void massage() {
		System.out.println("很硬，坐起来不舒适");
		
	}
	
}