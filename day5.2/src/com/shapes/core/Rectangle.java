package com.shapes.core;

/*
 * 2. Rectangle extends BoundedShape
state - x,y,w,h
Behaviour : computeArea 
- formula
- details

 */
public class Rectangle extends BoundedShape {
	private double width;
	private double height;
	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	//get details
	@Override
	public String toString() {
		return "Rectange -"+super.toString()+" w="+this.width+" h="+this.height;
	}
	//area computation
	@Override
	public double computeArea()
	{
		return width*height;
	}
	
}
