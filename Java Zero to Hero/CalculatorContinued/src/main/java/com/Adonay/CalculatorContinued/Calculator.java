package com.Adonay.CalculatorContinued;

public class Calculator {
	public double calculate(double a, double b, String operation) {
		switch(operation) {
		case "add":
			return a + b;
		case "subtract": 
			return a - b;
		case "multiply":
			return a*b;
		case "divide":
			return a/b;
		default : 
			return 0.0;
		}
	}
}
