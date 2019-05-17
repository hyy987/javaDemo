package com.bjsxt.template.method;

public class Client {

	public static void main(String[] args) {
		BankTemplateMethod btm = new BankTemplateMethod() {
			
			@Override
			public void transtact() {

				System.out.println("我要存钱");
			}
		};
		btm.proess(); 
	}
}
