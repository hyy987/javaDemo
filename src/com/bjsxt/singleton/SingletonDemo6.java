package com.bjsxt.singleton;

/**
 * （如何防止反射和反序列化）
 * 
 * @author admin
 *
 */
public class SingletonDemo6 {

	// 类 初始化时，不初始化该对象（延时加载，真正使用时再创建对象实例)
	private static SingletonDemo6 instance; 
	
	//私有构造器，保证外部无法实例化该类
	private SingletonDemo6() {

	}

	//方法同步，调用效率低
	public static synchronized SingletonDemo6 getInstance() {
		if(null == instance) {
			instance = new SingletonDemo6();
		}
		return instance;
	}
}
