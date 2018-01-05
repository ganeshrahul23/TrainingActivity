package com.sapient.demo;

public class Calculator implements Conversion, Scientific {
	private int number;
	
	public Calculator(int number) {
		this.number = number;
	}
	@Override
	public void findLeap() {
		System.out.println("Leap year");

	}

	@Override
	public void findFact() {
		System.out.println("Factorial");

	}

	@Override
	public void findQuadratic() {
		System.out.println("Quadratic");
	}

	@Override
	public void Convert2Oct() {
		System.out.print("Conversion to Octal ");
		System.out.println(Integer.toOctalString(number));

	}

	@Override
	public void Convert2Dec() {
		System.out.print("Conversion to Decimal ");
		System.out.println(number);

	}

	@Override
	public void Convert2Hexa() {
		System.out.print("Conversion to HexaDecimal ");
		System.out.println(Integer.toHexString(number));

	}

}
