package com.bjsxt.adapter;

/**
 * 客户端
 * （相当于列子中的笔记本，只有usb接口）
 * @author admin
 *
 */
public class Client {

	public void test1(Target t) {
		t.handleReq();
	}
	
	public static void main(String[] args) {
		Client c = new Client();
		Adaptee a = new Adaptee();
		Target t = new Adapter2(a);
		c.test1(t);
		
	}
}
