package com.bjsxt.observer2;

public class Client {

	public static void main(String[] args) {
		//创建目标对象Obserable
		ConcreteSubject cs = new ConcreteSubject();
		
		//创建观察者
		ObserverA a = new ObserverA();
		ObserverA b = new ObserverA();
		ObserverA c = new ObserverA();
		
		cs.addObserver(a);
		cs.addObserver(b);
		cs.addObserver(c);
		
		//改变subject对象的状态
		cs.set(3000);
		System.out.println("状态修改了");
		//观察者状态
		System.out.println(a.getMyState());
	}
}
