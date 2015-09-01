/**
 * 
 */
package org.dimigo.inheritance;

public class Circle extends Figure {
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
	}
	
	protected double calcArea() {
		return 3.14*radius*radius;	
	}
	
	protected void printCenter(){
		System.out.print("원 ");
		super.printCenter();
	}

}
