package com.bjsxt.command;

public interface Command {

	/**
	 * 这个方法是一个返回为空的方法‘
	 * 实际可以设计多个不同的方法
	 */
	void execute();
}

class ConcreteCommand implements Command{

	private Receiver receiver;
	
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}


	@Override
	public void execute() {
		
		receiver.action();
	}
	
}