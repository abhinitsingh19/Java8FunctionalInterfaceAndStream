package com.java8.functionalinterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class ForEachdDemo 
{

	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("mohan","lalit","mahesh","Monika","radha");
		
//		list.forEach(t-> {System.out.println(t);});
		
		
		
		list.stream().filter(t->t.startsWith("m")).forEach(t->System.out.println(t));
		
		
		Map<Integer,String> map = new HashMap();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		
		BiConsumer biConsumer=	  ( t,  u)->{System.out.println(t+","+u);};
		map.forEach(biConsumer);
		
		map.entrySet().stream().filter(obj-> obj.getKey()%2==1).forEach(obj->System.out.println(obj));

	}

}
