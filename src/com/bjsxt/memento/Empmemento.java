package com.bjsxt.memento;
/**
 * 备忘录类
 * @author SifuZhou
 *
 */
public class Empmemento {

	private String name;
	private int age;
	private double salary;
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
	
	public Empmemento(Emp e) {
		this.name =e.getName();
		this.age = e.getAge();
		this.salary =e.getSalary();
	}
}
