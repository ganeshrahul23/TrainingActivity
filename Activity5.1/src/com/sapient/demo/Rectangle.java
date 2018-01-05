package com.sapient.demo;

public class Rectangle implements Shape {
	double length; 
	double width;
		
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public void calcArea() {
		double result = length * width;
		System.out.println("The Shape is Rectanle");
		System.out.println("The length is " + length);
		System.out.println("The width is " + width);	
		System.out.println("The Area is " + result);
	}
	
}
