package com.bjsxt.bridge;

public class Client {

	public static void main(String[] args) {
		//销售联想的笔记本
		Computer2 c = new Laptop2(new Lenovo());
		c.sale();
	}
}
