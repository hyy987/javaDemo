package com.bjsxt.abstractfactory;

public interface Tyre {

	void abrasion();
}

class LuxuyTyre implements Tyre{

	@Override
	public void abrasion() {
		System.out.println("米其林，超耐磨");
		
	}
	
}
class LowTyre implements Tyre{
	
	@Override
	public void abrasion() {
		System.out.println("垃圾轮胎，赶紧换");
		
	}
	
}