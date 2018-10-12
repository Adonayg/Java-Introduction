package com.Adonay.CalculatorContinued;

/**
 * Calculator 2.0
 *
 */
public class App {
	static private int input1 = 20;
	static private int input2 = 30;
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println("input1: " + input1 + " input2: " + input2 + "\n");
		
		System.out.println("addition: " + calc.calculate(input1, input2, "add"));
		System.out.println("multiplication: " + calc.calculate(input1, input2, "multiply"));
		System.out.println("subtraction: " + calc.calculate(input1, input2, "subtract"));
		System.out.println("division: " + calc.calculate(input1, input2, "divide"));
		
	}
}
