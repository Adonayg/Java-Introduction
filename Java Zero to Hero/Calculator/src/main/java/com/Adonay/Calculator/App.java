package com.Adonay.Calculator;

/**
 * Basic Calculator
 *
 */
public class App {
	private static int input1 = 29;
	private static int input2 = 10;
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("input1: " + input1 + " input2: " + input2 + "\n");
		System.out.println("addition: " + calc.add(input1, input2));
		System.out.println("subtraction: " + calc.subtract(input1, input2));
		System.out.println("multiplication: " + calc.multiply(input1, input2));
		System.out.println("division: " + calc.divide(input1, input2));
		
	}
}
