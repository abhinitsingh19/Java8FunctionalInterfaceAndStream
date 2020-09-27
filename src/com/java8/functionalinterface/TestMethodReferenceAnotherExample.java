package com.java8.functionalinterface;

public class TestMethodReferenceAnotherExample 
{

	public static void main(String[] args) 
	{
		Thread thread = new Thread(TestMethodReferenceAnotherExample::printMessage);//TestMethodReferenceAnotherExample::printMessage
		//is equivalent to ()->printMessage()
		
		thread.start();
	}
	
	private static void printMessage() 
	{
		System.out.println("Method Reference Example");
	}

}
