package com.shapes.core;

/*
 * 1. BoundedShape -- 
super class
- state : tight encapsulation
 x,y
 constructor
 
 add a method to return details of bounded shape
 

 */
public abstract class BoundedShape {
	private int x;
	private int y;
	public BoundedShape(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "x="+x+" y="+y;
	}
	//add computeArea
	public abstract double computeArea();
	
}
