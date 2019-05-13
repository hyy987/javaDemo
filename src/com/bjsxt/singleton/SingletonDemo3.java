package com.bjsxt.singleton;

/**
 * 双重检测单例模式
 * 
 * @author admin
 *
 */
public class SingletonDemo3 {

	// 
	private static SingletonDemo3 instance=null; 
	
	//私有构造器，保证外部无法实例化该类
	private SingletonDemo3() {

	}

	//
	public static  SingletonDemo3 getInstance() {
		if(null == instance) {
			SingletonDemo3 s3;
			synchronized (SingletonDemo3.class) {
				s3=instance;
				if(s3==null) {
					synchronized (SingletonDemo3.class) {
						if(s3==null) {
							s3= new SingletonDemo3();
						}
					}
					instance=s3;
				}	
			}
		}
		return instance;
	}
}
