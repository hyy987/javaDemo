package com.bjsxt.test;

import com.bjsxt.singleton.SingletonDemo1;
import com.bjsxt.singleton.SingletonDemo4;
import com.bjsxt.singleton.SingletonDemo5;

public class Client {

	public static void main(String[] args) {
		SingletonDemo1 s1 = SingletonDemo1.getInstance();
		SingletonDemo1 s2 = SingletonDemo1.getInstance();
		System.out.println(s1 == s2);
		
		SingletonDemo4 s40 = SingletonDemo4.getInstance();
		SingletonDemo4 s41 = SingletonDemo4.getInstance();

		System.out.println(s40==s41);
		
		System.out.println(SingletonDemo5.INSTANCE == SingletonDemo5.INSTANCE);
	}
}
