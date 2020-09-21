package com.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo 
{

	public static void main(String[] args) 
	{
	
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream().filter(t -> t%2==1).forEach(t->System.out.println(t));
	}

}
