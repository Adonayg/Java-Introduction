package com.Adonay.LambdaHelloWorld;

/**
 * Hello world! Using Lambda
 *
 */
public class App {
	public static void main(String[] args) {
		StringOperator greeter = name -> "Hello " + name;
		
		greeter.greet("Hello");
		System.out.println(greeter.greet("World"));
	}
}
