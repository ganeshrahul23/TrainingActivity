package com.sapient.demo;

public class Cone implements Shape {
	double radius; 
	double height;
		
	public Cone(double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double calcVolume() {
		double result = Math.PI * radius * radius * height / 3;
		return result;
	}
	
	public void display(){
		System.out.println("The Shape is Cone");
		System.out.println("The radius is " + radius);
		System.out.println("The Height is " + height);	
		System.out.println("The Volume is " + calcVolume());
	}
}
