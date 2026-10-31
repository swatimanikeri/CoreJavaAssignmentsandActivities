package com.cdac.tester;
import java.util.*;
import com.cdac.core.Point2D;

public class TestPoint{
public static void main(String[] args){
int noOfPoints;
int x,y;
Point2D p1=new Point2D(1,2);
Point2D p2=new Point2D(1,2);
Scanner sc=new Scanner(System.in);

if(p1.isEqual(p2)){
System.out.println("Point p1 "+"(" + p1.getX()+","+p2.getY() + ")"+" is equal to Point p2"+"(" + p2.getX()+","+p2.getY() + ")");
}
else{
System.out.println("The both points are NOT EQUAL!!");
} 
System.out.println("How Many boxes do you want?");
noOfPoints=sc.nextInt();
Point2D[] points=new Point2D[noOfPoints];

for(int i=0;i<noOfPoints;i++) {

	System.out.println("Enter Values of x & y: ");
	x=sc.nextInt();
	y=sc.nextInt();
	points[i]=new Point2D(x,y);
//	points[i].setX(x);
//	points[i].setY(y);
}
//for(int i=0;i<noOfPoints;i++) {
//	System.out.println(points[i].toString());
//
//}
for(Point2D p:points) {
	System.out.println(p.toString());
	
}
sc.close();
} 

}