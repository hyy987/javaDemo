package com.bjsxt.singleton;

/**
 * 测试懒汉式单例模式
 * 
 * @author admin
 *
 */
public class SingletonDemo2 {

	// 类 初始化时，不初始化该对象（延时加载，真正使用时再创建对象实例)
	private static SingletonDemo2 instance; 
	
	//私有构造器，保证外部无法实例化该类
	private SingletonDemo2() {

	}

	//方法同步，调用效率低
	public static synchronized SingletonDemo2 getInstance() {
		if(null == instance) {
			instance = new SingletonDemo2();
		}
		return instance;
	}
}
