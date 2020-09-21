package com.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo 
{
	public static void main(String[] args) 
	{
		
		Supplier<String> supplier =   () -> "Not found";
		
		List<String> list =Arrays.asList();
		
		System.out.println(list.stream().findAny().orElseGet(supplier));
		
	
		
	}

}
