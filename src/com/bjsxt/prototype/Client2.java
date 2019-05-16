package com.bjsxt.prototype;

import java.util.Date;

/**
 * 原型模式（深复制）
 * @author admin
 *
 */
public class Client2 {

	public static void main(String[] args) throws Exception {
		Date date = new Date(327187432842L);
		Sheep2 s1 = new Sheep2("少利", date);
		Sheep2 s2 = (Sheep2) s1.clone();
		
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());

		date.setTime(4627223823828L);
		System.out.println(s1.getBirthday());
		
	
		
		
		
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}
}
