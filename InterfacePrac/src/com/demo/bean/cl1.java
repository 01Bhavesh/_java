package com.demo.bean;

public class cl1 {
	
	private int x;
	private int y;
	public cl1() {
		super();
	}
	public cl1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "cl1 [x=" + x + ", y=" + y + "]";
	}
	
	
}
