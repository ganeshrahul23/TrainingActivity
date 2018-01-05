package com.sapient.demo;

public class Client {

	public static void main(String[] args) {
		Shape[] shp = new Shape[3];
		shp[0] = new Sphere(4.5);
		shp[1] = new Cone(3.4, 5.7);
		shp[2] = new Cylinder(23.4, 5.3);
		
		for(Shape s:shp){
			s.calcVolume();
			System.out.println("--------------------------------------");
		}

	}

}
