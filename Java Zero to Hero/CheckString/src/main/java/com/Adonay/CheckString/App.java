package com.Adonay.CheckString;

/**
 * Check String if they are equal to hard coded string and check two string to
 * see if they are equal.
 *
 */
public class App {
	public static void main(String[] args) {
		CheckString checker = new CheckString();
		System.out.println(checker.checkString("Hello"));
		System.out.println(checker.checkStrings("Hello", "Hello"));
		System.out.println(checker.checkString("World"));
		System.out.println(checker.checkStrings("hello", "world"));

	}
}
