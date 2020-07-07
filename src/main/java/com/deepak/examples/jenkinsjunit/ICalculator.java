package com.deepak.examples.jenkinsjunit;

public interface ICalculator {
	int sum(int a, int b);

	int subtraction(int a, int b);

	int multiplication(int a, int b);

	int divison(int a, int b) throws Exception;
	
	int square(int a);
	
	int cube(int c);
	
	int vol(int l, int b, int h); 
	
	int circle(int r);

	boolean equalIntegers(int a, int b);
}
