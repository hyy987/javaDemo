package com.bjsxt.flyweight;
/**
 * 享元类
 * @author admin
 *
 */
public interface ChessFlyWeight {

	void setColor(String color);
	String getColor();
	void display(Coordinate c);
	
	
}

class ConcreteChess implements ChessFlyWeight{

	private String color;
	@Override
	public void setColor(String color) {
		this.color=color;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinate c) {

		System.out.println("棋子原色"+color);
		System.out.println("棋子坐标"+c.getX()+"  "+c.getY());
		
	}
	
}
