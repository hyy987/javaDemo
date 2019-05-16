package com.bjsxt.prototype;

import java.util.Date;

public class Client {

	public static void main(String[] args) throws Exception {
		Date date = new Date(32627837232L);
		Sheep s1 = new Sheep("少利", date);
		Sheep s2 = (Sheep) s1.clone();
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		date.setTime(326123676321L);
		System.out.println(s1.getBirthday());
		
		
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
		
	}
	
}
