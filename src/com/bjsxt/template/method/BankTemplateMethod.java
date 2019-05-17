package com.bjsxt.template.method;

public abstract class BankTemplateMethod {

	public void takeNumber() {
		System.out.println("取号排队");
	}	
	
	public abstract void transtact();
	
	public void feedback() {
		System.out.println("反馈评分");
	}
	
	public void proess() {
		this.takeNumber();
		this.transtact();
		this.feedback();
	}
}
