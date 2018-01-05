package com.sapient.demo;

public class Circle implements Shape {
	double radius; 
		
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void calcArea() {
		double result = Math.PI * radius * radius;
		System.out.println("The Shape is Circle");
		System.out.println("The radius is " + radius);
		System.out.println("The Area is " + result);
	}
	
}
