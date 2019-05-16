package com.bjsxt.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandle implements InvocationHandler {
	private Star star;
	
	

	public StarHandle(Star star) {
		super();
		this.star = star;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object= null;
		
		System.out.println("真正的方法执行前");
		System.out.println("面谈，签合同，预付款，订机票");
		if(method.getName().equals("sing")) {
			object= method.invoke(star, args);		
		}
		System.out.println("真正方法执行后");
		System.out.println("收尾款");
		return object;
	}

}
