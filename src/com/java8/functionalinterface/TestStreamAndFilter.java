package com.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	private int id;
	private String name;
	private String dept;
	private long salary;
	public Employee(int id, String name, String dept, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
}
public class TestStreamAndFilter 
{

	static List<Employee> list = Arrays.asList(new Employee(123,"sohan","SIT",600000),new Employee(345,"sohaq","SIT",800000),new Employee(765,"sohana","SIT",400000),
			new Employee(123,"sohani","SIT",500000));


	public static void main(String[] args) 
	{
		System.out.println(fetchTaxableEmployeeList());

	}


	private static List<Employee> fetchTaxableEmployeeList() {
		return	list.stream().filter(t->t.getSalary()>500000).collect(Collectors.toList());
	}

}
