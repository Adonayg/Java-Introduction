package com.Adonay.Persons;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args ) {
	PersonManager Instructor = new PersonManager();
	Person ind1 = new Person("jesus" , 26);
	ind1.toString();
	
	Person ind2 = new Person("lisa", 28, "software Engineer");
	Person ind3 = new Person("john", 30, "software Engineer");
	Person ind4 = new Person("kevin", 24, "software Engineer");
	Person ind5 = new Person("smithy", 27, "software Engineer");
	Person ind6 = new Person("kevin", 21, "software Engineer");
	Person ind7 = new Person("john", 65, "software Engineer");
	Person ind8 = new Person("john", 39, "software Engineer");

	List<Person> personList = new ArrayList<Person>();
	personList.add(ind1);
	personList.add(ind2);
	personList.add(ind3);
	personList.add(ind4);
	personList.add(ind5);
	personList.add(ind6);
	personList.add(ind7);
	personList.add(ind8);
	
	Instructor.setPersonList(personList);
	
	//Instructor.getPersonList().forEach(System.out::println);
	
	(Instructor.searchFor(ind3.getName(), Instructor.getPersonList())).forEach(System.out::println);
	}
}
