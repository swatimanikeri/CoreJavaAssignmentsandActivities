package com.shapes.tester;

import com.shapes.core.BoundedShape;
import com.shapes.core.Circle;
import com.shapes.core.Rectangle;

/*
 * 4. Create a TestShapes application with main method
Create bounded shapes .
Display their  
- details
- computed area 
using single for-each loop.

 */
public class TestShapes {

	public static void main(String[] args) {
		//{c1,r1,c2,r2}
		BoundedShape[] shapes= {new Circle(10, 20, 10.23),
				new Rectangle(20, 40, 10, 12.5),
				new Circle(11, 24, 15.23),
				new Rectangle(26, 70, 11, 13.5)};
		for(BoundedShape shape : shapes)
		{
			System.out.println(shape);//shape.toString
			System.out.println("Area - "+shape.computeArea());
		}

	}

}
