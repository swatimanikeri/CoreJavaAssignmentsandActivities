
package com.cdac.tester;
import java.util.Arrays;

import com.cdac.core.Box;
class TestBox{
public static void main(String[] args){
//	System.out.println("The details of b1");
//Box b1=new Box(1,2,3);
//Box b2=new Box(10,20,30);
//b1.getBoxDetails();
//System.out.println("Volume of Box: "+b1.calVolume());
//b1.doubleTheWitdh();
//System.out.println("The details of b2");
//b2.getBoxDetails();
//b2.getBoxDetails();
//System.out.println("Volume of Box: "+b2.calVolume());
//b2.doubleTheWitdh();
//
//b2.getBoxDetails();

Box[] boxes = {
	    new Box(1, 2, 3),
	    new Box(10, 20, 30)
	};

	System.out.println(Arrays.toString(boxes));
}
}