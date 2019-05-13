package com.bjsxt.test;

import java.lang.reflect.Constructor;

import com.bjsxt.singleton.SingletonDemo6;

/**
 * 测试反射和反序列化破解单例模式
 * 
 * @author admin
 *
 */
public class Client2 {

	public static void main(String[] args) throws Exception{

		SingletonDemo6 s1 = SingletonDemo6.getInstance();
		SingletonDemo6 s2 = SingletonDemo6.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		
		Class<SingletonDemo6> s6 = (Class<SingletonDemo6>)Class.forName("com.bjsxt.singleton.SingletonDemo6");
	
		
		Constructor<SingletonDemo6> c =s6.getConstructor(null);
		c.setAccessible(true);
		SingletonDemo6 s60 = c.newInstance();
		SingletonDemo6 s61 = c.newInstance();
		System.out.println(s60);
		System.out.println(s61);
	}
}
