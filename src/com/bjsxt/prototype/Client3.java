package com.bjsxt.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 使用序列化和反序列化实现深克隆
 * @author admin
 *
 */
public class Client3 {

	public static void main(String[] args) throws CloneNotSupportedException, Exception {
		Date date = new Date(32627837232L);
		Sheep s1 = new Sheep("少利", date);
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		
//		Sheep s2 = (Sheep) s1.clone();
		//使用序列化和发序列化实现深复制
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Sheep s2 = (Sheep)ois.readObject();
		
		System.out.println("修改原型对象属性");
		date.setTime(326123676321L);
		System.out.println(s1.getBirthday());
		System.out.println(s2.getBirthday());
	}
}
