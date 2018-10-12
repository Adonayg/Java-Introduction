package com.Adonay.StreamCollections;

import java.util.Arrays;

/**
 * Using streams to do the same thing as Collections maven project
 *
 */
public class App {
	public static void main(String[] args) {
		StreamCollections col = new StreamCollections();
		System.out.println(Arrays.toString(col.populateArray()));
		col.populateList().forEach(System.out::println);
		col.multiplyByTen(col.populateList()).forEach(System.out::println);
	}
}
