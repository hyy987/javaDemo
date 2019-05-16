package com.bjsxt.prototype;

/**
 * 测试创建大量对象时new和克隆的效率
 * @author admin
 *
 */
public class Client4 {

	public static void main(String[] args) {
		testNew(1000);
		testClone(1000);
		
	}
	
	public static void testNew(int size) {
		long start=  System.currentTimeMillis();
		for(int i=0;i<size;i++) {
			Laptop l = new Laptop();
		}
		long end =System.currentTimeMillis();
		System.out.println("new消耗时间为："+(end-start));
	}
	
	public static void testClone(int size) {
		long start=  System.currentTimeMillis();
		Laptop l = new Laptop();
		for(int i=0;i<size;i++) {
			try {
				Laptop newL =(Laptop) l.clone();
			} catch (CloneNotSupportedException e) {

			}
		}
		long end =System.currentTimeMillis();
		System.out.println("Clone消耗时间为："+(end-start));
	}
	
}


class Laptop{
	public Laptop(){
		try {
			Thread.sleep(10);//模拟创建对象耗时过程
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();//直接调用object对象的clone方法
		return obj;
	}
}