package com.ibm.training.basics;

import java.util.Objects;

public class Point {

	private int x,y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	//not completely correct - we'll fix later
//	public boolean equals(Point other) {
//		if(this.x == other.x && this.y == other.y) {
//			return true;
//		}else {
//			return false;
//		}
//	}
	
	//not completely correct - we'll fix later
//	public boolean equals(Object o) {
//		Point other = (Point) o;
//		return (this.x == other.x && this.y == other.y); 
//	}
	
	public String toString() {
		return "Point[x="+x+",y="+y+"]";
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
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

	
	
	
	
	
}
