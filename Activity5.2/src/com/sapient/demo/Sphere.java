package com.sapient.demo;

public class Sphere implements Shape {
	double radius; 
		
	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double calcVolume() {
		double result = (4/3) * Math.PI * radius * radius * radius;
		return result;
	}
	
	public void display(){
		System.out.println("The Shape is Sphere");
		System.out.println("The radius is " + radius);
		System.out.println("The Volume is " + calcVolume());
	}
}
