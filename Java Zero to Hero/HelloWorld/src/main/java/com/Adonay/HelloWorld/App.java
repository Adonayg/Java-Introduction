package com.Adonay.HelloWorld;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		staticPrintHelloWorld();
		staticPrintParam("Hello");
		App application = new App();
		
		
		application.printHelloWorld();
		application.printParam("Hello");

	}

	public static void staticPrintHelloWorld() {
		System.out.println("\n Static HelloWorld Method");
		System.out.println("Hello World!");
	}
	
	public static void staticPrintParam(String input) {
		System.out.println(input);
	}

	public String printHelloWorld() {
		System.out.println("\n Non-static HelloWorld Method");
		return "Hello World";
	}
	
	public String printParam(String input) {
		return input;
	}
	
	
}
