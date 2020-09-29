package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import com.java8.functionalinterface.Person;

public class TestStream 
{

	public static void main(String[] args) 
	{
		List<Person> people = Arrays.asList(new Person(30,"Aarush","sharma"),
				new Person(32,"Vivek","sharma"),
				new Person(36,"Ashutosh","malvani"));
		
		//print the first names of all persons in sorted age whose age is greater than 31
		
		people.stream().filter(e-> e.getAge()>31).map(e->e.getFirstName()).sorted().forEach(System.out::println);
		
		//counting number of persons with age greater than 30.
		
		System.out.println(people.stream().filter(p->p.getAge()>30).count());
		
		//find all  persons with last Names as Sharma
		
		people.stream().filter(p->p.getLastName().equalsIgnoreCase("Sharma")).forEach(p->System.out.println(p));
		
		//find a  persons with maximum age
		
		OptionalInt maxAge = people.stream().mapToInt(p->p.getAge()).max();
		if(maxAge.isPresent())
			System.out.println(maxAge.getAsInt());
		
		//List all persons grouped by their first Names
		
		Map<String, List<Person>> collect = people.stream().collect(Collectors.groupingBy(p->p.getFirstName()));
		collect.forEach((k,v)->System.out.println(k+">> "+v));
		
		//Join the all employee names with “,”
		
		List<String> empNamesStr = people.stream().map(p->p.getFirstName()).collect(Collectors.toList());
		
		System.out.println(String.join(",", empNamesStr));
		
		
	}

}
