package com.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;

public class TestMethodReference
{
	
	static List<Person> list = Arrays.asList(new Person(28,"Ram","Ahuja"),
			new Person(23,"Balram","Pahuja"),
			new Person(30,"Ramesh","Mahuja"));
	
	

	public static void main(String[] args)
	{
		list.stream().filter(p->p.getAge()>25).forEach(System.out::println);
	}

}
