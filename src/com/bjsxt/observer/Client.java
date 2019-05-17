package com.bjsxt.observer;

public class Client {

	public static void main(String[] args) {
		// 目标对象
		ConcreteSubject subject = new ConcreteSubject();

		// 创建多个观察者
		ObserverA o1 = new ObserverA();
		ObserverA o2 = new ObserverA();
		ObserverA o3 = new ObserverA();
		System.out.println(o1.getMyState());
		System.out.println(o2.getMyState());
		System.out.println(o3.getMyState());

		// 将三个观察者添加到subject对象的观察者队伍中
		subject.register(o1);
		subject.register(o2);
		subject.register(o3);

		// 修改主题对象的位置
		subject.setState(300);

		System.out.println("修改主题对象后");

		o1.update(subject);
		o2.update(subject);
		o3.update(subject);

		System.out.println(o1.getMyState());
		System.out.println(o2.getMyState());
		System.out.println(o3.getMyState());
	}
}
