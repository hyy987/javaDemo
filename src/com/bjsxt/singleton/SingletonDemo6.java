package com.bjsxt.singleton;

import java.io.Serializable;

/**
 * （如何防止反射和反序列化）
 * 
 * @author admin
 *
 */
public class SingletonDemo6  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3099740769041171879L;
	// 类 初始化时，不初始化该对象（延时加载，真正使用时再创建对象实例)
	private static SingletonDemo6 instance; 
	
	//私有构造器，保证外部无法实例化该类
	private SingletonDemo6() {

		if(null != instance) {
			throw new RuntimeException();
		}
	}

	//方法同步，调用效率低
	public static synchronized SingletonDemo6 getInstance() {
		if(null == instance) {
			instance = new SingletonDemo6();
		}
		return instance;
	}
	
	//反序列化时：如果定义了readResolve()则直接返回此方法指定的对象。而不需要单独在创建新对象！
	private Object readResolve() {
		return instance;
	}
}
