package com.bjsxt.strategy;

public class NewCustomerFewStregy implements Stretegy{

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("不打折");
		return standardPrice;
	}

	
}
