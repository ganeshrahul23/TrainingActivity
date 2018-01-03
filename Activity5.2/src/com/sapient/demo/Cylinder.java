package com.sapient.demo;

public class Cylinder implements Shape {
	double radius; 
	double height;
		
	public Cylinder(double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double calcVolume() {
		double result = Math.PI * radius * radius * height;
		return result;
	}
	
	public void display(){
		System.out.println("The Shape is Cylinder");
		System.out.println("The radius is " + radius);
		System.out.println("The Height is " + height);	
		System.out.println("The Volume is " + calcVolume());
	}

}
