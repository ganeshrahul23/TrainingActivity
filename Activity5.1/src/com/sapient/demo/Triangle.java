package com.sapient.demo;

public class Triangle implements Shape {
	double base; 
	double height;
		
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public void calcArea() {
		double result = base * height / 2;
		System.out.println("The Shape is Triangle");
		System.out.println("The Base is " + base);
		System.out.println("The Height is " + height);	
		System.out.println("The Area is " + result);
	}
	
}
