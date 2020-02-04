package com.spring.service;
import java.util.*;
import com.spring.model.Employee;

public class EmployeeManager {
private static List<Employee> employeelist;
public EmployeeManager()
{
	employeelist=new ArrayList<Employee>();
	employeelist.add(new Employee("1","john","kohli"));
	employeelist.add(new Employee("2","parth","virat"));
	employeelist.add(new Employee("3","seema","ABd"));
}
	public List<Employee>getEmployeeList()
	{
		return employeelist;
	}
} 
