package com.bjsxt.command;
/**
 * 命令发起者
 * @author admin
 *
 */
public class Invoke {

	private Command command;//也可以通过容器，进行批处理

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	
	//业务方法，用于调用命令类的方法
	public void call() {
		command.execute();
	}
}
