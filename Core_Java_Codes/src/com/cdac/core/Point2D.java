package com.cdac.core;

public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    
    public void setX(int x) {
      this.x=x;
    }

    public void setY(int y) {
        this.y=y;
    }
    // Standard Java practice instead of show()
    @Override
    public String toString() {
        return "The x point is " + getX() + ", The y point is: " + getY();
    }

    // Simplified comparison logic made public
    public boolean isEqual(Point2D p1) {
        if (p1 == null) return false;
        return (this.x == p1.x) && (this.y == p1.y);
    }

}
