package com.bjsxt.state;

public class Context {

	//如果时银行系统，这个Context类就是账户。根据金额不同，切换到不同的状态
	private State state;
	public void setState(State s) {
		System.out.println("修改状态！");
		state=s;
		state.handle();
	}
}
