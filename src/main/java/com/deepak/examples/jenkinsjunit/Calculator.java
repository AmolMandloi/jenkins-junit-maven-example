package com.deepak.examples.jenkinsjunit;



public class Calculator implements ICalculator {

	
	
	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	@Override
	public int subtraction(int a, int b) {
		return a - b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a * b;
	}

	@Override
	public int divison(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Divider can't be zero");
		}

		return a / b;
	}
	
	@Override
	public int square(int a) {
		return a * a;
	}
	
	@Override
	public int cube(int c) {
		return c * c * c;
	}
	
	@Override
	public int vol(int l, int b, int h) {
		return l * b * h;
		
	}
	@Override
	public double circle(int r) {
		return 3.14 * r * r;
	}
		
		

	@Override
	public boolean equalIntegers(int a, int b) {
		boolean result = false;

		if (a == b) {
			result = true;
		}

		return result;
	}
}
