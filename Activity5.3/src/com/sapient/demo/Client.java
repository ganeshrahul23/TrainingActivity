package com.sapient.demo;

public class Client {
	public static void main(String[] args) {
		Calculator calc = new Calculator(2004);
		
		Conversion con = calc;
		con.Convert2Dec();
		con.Convert2Hexa();
		con.Convert2Oct();
		
		Scientific sci = calc;
		sci.findFact();
		sci.findLeap();
		sci.findQuadratic();
	}
}
