package com.sapient.demo;

public class Client {

	public static void main(String[] args) {
		Shape[] shp = new Shape[3];
		shp[0] = new Circle(4.5);
		shp[1] = new Rectangle(3.4, 5.7);
		shp[2] = new Triangle(23.4, 5.3);
		
		for(Shape s:shp){
			s.calcArea();
			System.out.println("--------------------------------------");
		}

	}

}
