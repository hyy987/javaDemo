package com.bjsxt.state;

public class Client {

	public static void main(String[] args) {
		Context c = new Context();
		State s = new FreeState();
		c.setState(s);
	}
}
