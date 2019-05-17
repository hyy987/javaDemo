package com.bjsxt.state;

/**
 * 空闲状态
 * @author admin
 *
 */
public class CheckInState implements State{

	@Override
	public void handle() {
		System.out.println("房间已预定");
		
	}

}
