package com.cdac.core;

public class Box{
	
private int width;
private int height;
private int length;
public double vol;

public Box(int v1,int v2,int v3){
this.width=v1;
this.height=v2;
this.length=v3;
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

public int getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

public double getVol() {
	return vol;
}

public void setVol(double vol) {
	this.vol = vol;
}

public void getBoxDetails(){
System.out.println("height: "+height);
System.out.println("width: "+width);
System.out.println("length: "+length);
}
//to calculate volumn
public double calVolume() {
 vol=width*height*length;
	return vol;
}
//to double the width if volume is >100
public void doubleTheWitdh() {
	if(this.getVol()>100) {
		width*=2;
		System.out.println("The Volume is greater than 100 so doubled width.");
	}
	else {
		System.out.println("The Volume is NOT greater than 100 so cant double width.");
	}
}


@Override
public String toString() {
    return "Width: " + width +
           ", Height: " + height +
           ", length: " + length;
}
}