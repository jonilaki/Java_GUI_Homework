package com.rectcalarea;
public class Shape {
	private int width;
	private int height;
	private int area;
	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public   void calcArea()
	{
	area= width*height;
	}
	public void display()
	{
		
		System.out.println("The area of rectangle is "+ area);
	}
}
	
	


