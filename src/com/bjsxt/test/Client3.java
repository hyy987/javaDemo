package com.bjsxt.test;

import java.util.concurrent.CountDownLatch;

import com.bjsxt.singleton.SingletonDemo1;

/**
 * 五种单例模式的多线程环境下的效率测试
 * @author SifuZhou
 *
 */
public class Client3 {

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		final CountDownLatch countDownLatch = new CountDownLatch(10);
		for(int i=0;i<10;i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for(int i=0;i<10000;i++) {
						SingletonDemo1 instance = SingletonDemo1.getInstance();
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		countDownLatch.await();//main线程阻塞，直到计数器变为0，才会继续往下执行
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
