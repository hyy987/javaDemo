package com.bjsxt.abstractfactory;

public class LuxuyEngine implements Engine {

	@Override
	public void run() {
		System.out.println("跑的快");
		
	}

	@Override
	public void filed() {
		System.out.println("转速快，启动快");
		
	}

}

class LowEngine implements Engine {

	@Override
	public void run() {
		System.out.println("跑的慢--");
		
	}

	@Override
	public void filed() {
		System.out.println("转速慢，启动慢");
		
	}

}
