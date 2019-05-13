package com.bjsxt.singleton;
/**
 * 静态内部类实现方法（懒加载）
 * 优点：线程安全，调用效率高，并且实现了延迟加载！
 * @author admin
 *
 */
public class SingletonDemo4 {

	private static class SingletonClassInstance{
		private static final SingletonDemo4 ins = new SingletonDemo4();
	}
	
	public static SingletonDemo4 getInstance() {
		return SingletonClassInstance.ins;
	}
	
	private SingletonDemo4() {
		
	}
}
