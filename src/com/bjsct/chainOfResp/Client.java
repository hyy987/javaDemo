package com.bjsct.chainOfResp;

public class Client {

	public static void main(String[] args) {
		Leader a = new Director("张三");
		Leader b = new Manager("李小四");
		Leader c = new GeneralManager("王五");
		
		a.setNextLeader(b);
		b.setNextLeader(c);
		LeaveRequest l1 = new LeaveRequest("Tom", 37, "回英国过年");
		a.handleRequest(l1);
	}
}
