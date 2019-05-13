package com.bjsxt.singleton;

/**
 * 测试饿汉式单例模式
 * 
 * @author admin
 *
 */
public class SingletonDemo1 {

	// 类 初始化时立即加载（没有延时加载优势）
	//由于加载类时，天然的是线程安全的
	private static SingletonDemo1 instance = new SingletonDemo1();

	private SingletonDemo1() {

	}

	//方法没有同步，调用效率高
	public static SingletonDemo1 getInstance() {
		return instance;
	}
}
