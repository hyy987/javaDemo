package com.bjsxt.factory.simmplefactory;

/**
 * 测试在没有工程模式的情况下
 * @author SifuZhou
 *
 */
public class Client02 {

	public static void main(String[] args) {
	
		Car c1= CarFatory.createCar("奥迪");
		Car c2 = CarFatory.createCar("比亚迪");
		c1.run();
		c2.run();
	}
}
