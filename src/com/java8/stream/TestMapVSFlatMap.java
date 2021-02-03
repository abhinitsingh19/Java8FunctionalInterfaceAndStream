package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMapVSFlatMap
{

	public static void main(String[] args) 
	{
		List<String> strList = Arrays.asList("stream","is","introdcued","in",
				"java8");
	
		List<String> collect = strList.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Transformed list using Java8 Map "+collect);
		
		
		List<String> strList1 = Arrays.asList("stream","is","introduced","in",
				"java8");
		
		List<String> strList2 = Arrays.asList("and","stream","is","widely","asked","in",
				"interviews");
		
		
		System.out.println("Transforming list of list of String using flatmap.first List of List of Strings will be flattened followedby transformation");
		
		List<List<String>> listOfListOfStrings = Arrays.asList(strList1,strList2);
	
		List<String> collect2 = listOfListOfStrings.stream().flatMap(list->list.stream()).map(str-> str.toUpperCase()).collect(Collectors.toList());
	
		System.out.println("Transformed list of list of String using flatmap "+collect2);
	}

}
