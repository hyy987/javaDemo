package com.bjsxt.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
		
		/*//通过反射的反射直接调用私有构造器
		Class<SingletonDemo6> s6 = (Class<SingletonDemo6>)Class.forName("com.bjsxt.singleton.SingletonDemo6");
		Constructor<SingletonDemo6> c =s6.getDeclaredConstructor(null);
		c.setAccessible(true);
		SingletonDemo6 s60 = c.newInstance();
		SingletonDemo6 s61 = c.newInstance();
		System.out.println(s60);
		System.out.println(s61);*/
		
		//通过反序列化方式构造多个对象
		FileOutputStream fos = new FileOutputStream("d:/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
		SingletonDemo6 s3 =(SingletonDemo6)ois.readObject();
		System.out.println(s3);
		
	}
}
