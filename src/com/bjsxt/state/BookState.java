package com.bjsxt.state;

/**
 * 空闲状态
 * @author admin
 *
 */
public class BookState implements State{

	@Override
	public void handle() {
		System.out.println("房间已入住，请勿打扰");
		
	}

}
