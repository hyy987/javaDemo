package com.bjsxt.memento;

public class Client {

	public static void main(String[] args) {
		CareTake take = new CareTake();
		
		Emp e1 = new Emp("弟弟", 18, 900);
		System.out.println("第一次创建对象"+e1.getName());
		
		take.setEmpmemento(e1.memento());//备忘一次
		//修改源发器对象内容
		e1.setAge(38);
		e1.setName("哥哥");
		e1.setSalary(90000);
		System.out.println("第二次打印对象"+e1.getName());
		
		e1.recover(take.getEmpmemento());
		System.out.println(e1.getName());
	}
	
}
