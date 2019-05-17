package com.bjsxt.Mediator;

public class Market implements Department{

	private Mediator m;
	
	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("market", this);
	}

	@Override
	public void selfAction() {

		System.out.println("采购与销售");
	}

	@Override
	public void outAction() {

		System.out.println("汇报工作，没钱了，无法购置物资");
		m.command("finacial");
	}

}
