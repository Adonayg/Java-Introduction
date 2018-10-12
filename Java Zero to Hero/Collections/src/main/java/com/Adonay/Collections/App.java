package com.Adonay.Collections;

import java.util.Arrays;

/**
 * Populating arrays and array lists
 *
 */
public class App {
	public static void main(String[] args) {
		Collections col = new Collections();
		System.out.println(Arrays.toString(col.populateArray()));
		col.populateList().forEach(System.out::println);
		col.multiplyByTen(col.populateList()).forEach(System.out::println);
	}
}
