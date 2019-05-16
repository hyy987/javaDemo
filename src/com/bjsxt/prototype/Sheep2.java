package com.bjsxt.prototype;

import java.util.Date;

public class Sheep2 implements Cloneable{

	private static final Object Sheep2 = null;
	private String sname;
	private Date birthday;
	
	
	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public Sheep2(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}

	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();//直接调用object对象的clone方法
		
		//添加代码实现深克隆
		Sheep2 sheep2 =(Sheep2)obj;
		sheep2.birthday = (Date) this.birthday.clone();//把属性也进行克隆
		return obj;
	}
}
