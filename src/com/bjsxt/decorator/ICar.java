package com.bjsxt.decorator;

/**
 * 抽象组件
 * 
 * @author admin
 *
 */
public interface ICar {

	void move();
}

/**
 * 具体构建对象（真实对象）
 * 
 * @author admin
 *
 */
class Car implements ICar {

	@Override
	public void move() {
		System.out.println("陆地上跑");
	}

}

class SuperCar implements ICar {
	protected ICar car;

	public SuperCar(ICar car) {
		super();
		this.car = car;
	}

	@Override
	public void move() {
		car.move();
	}

}

class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
	}
	public void fly() {
		System.out.println("天上飞");
	}
	
	@Override
	public void move() {
		super.move();
		fly();
	}
}
class WaterCar extends SuperCar{
	
	public WaterCar(ICar car) {
		super(car);
	}
	public void swim() {
		System.out.println("水上游");
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}
}
class AICar extends SuperCar{
	
	public AICar(ICar car) {
		super(car);
	}
	public void autoDrive() {
		System.out.println("人工智能驾驶");
	}
	
	@Override
	public void move() {
		super.move();
		autoDrive();
	}
}