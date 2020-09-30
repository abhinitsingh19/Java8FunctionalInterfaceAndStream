package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class TestStreamRemoveDuplicates 
{
	
	public static void main(String[] args) 
	{
		List<Integer> intList = Arrays.asList(10,10,20,20,30,40,50,60);
		
		List<String> strList = Arrays.asList("Abhinit","Abhishek","Aarush","prabhat","Rahul","Nitin");
		
		OptionalDouble average = intList.stream().mapToInt(i->i*i).filter(i->i>500).average();
		if(average.isPresent())
		{
			System.out.println(average.getAsDouble());
		}
		
		//removing duplicate from list of integers.
		
		intList.stream().distinct().forEach(System.out::println);
		
		//filter names which start with letter 'A' and print them after conversion to lower case
		
		strList.stream().filter(s->s.startsWith("A")).map(s->s.toLowerCase()).forEach(System.out::println);
		
		
	}

}
