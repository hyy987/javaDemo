package com.bjsxt.Mediator;

public class Finacial implements Department{

	private Mediator m;
	
	public Finacial(Mediator m) {
		super();
		this.m = m;
		m.register("finacial", this);
	}

	@Override
	public void selfAction() {

		System.out.println("数钱");
		
	}

	@Override
	public void outAction() {

		System.out.println("汇报工作，没钱了，财务库空了");
	}

}
