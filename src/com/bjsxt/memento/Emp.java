package com.bjsxt.memento;
/**
 * 源发器类
 * @author SifuZhou
 *
 */
public class Emp {

	private String name;
	private int age;
	private double salary;
	
	//进行备忘操作，便返回备忘录对象
	public Empmemento memento() {
		return new Empmemento(this)
;	}
	
	//进行数据恢复
	public void recover(Empmemento em) {
		this.name = em .getName();
		this.age = em.getAge();
		this.salary =em.getSalary();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Emp(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
}
