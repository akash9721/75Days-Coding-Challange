package com.java.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeApp {

	public static void main(String[] args) {
		
		List<Employee> employee=Arrays.asList(
				new Employee("Akash", 23, "Male", "CSE", 86000),
				new Employee("Sanju", 25, "Male", "HR", 50000),
				new Employee("Mehak", 23, "Female", "IT", 70000),
				new Employee("Nupur", 24, "Male", "HR", 75000)
				                             );
		
		
		//1. show all employee
		employee.stream().map(x->x).forEach(x->System.out.println(x));
		
		System.out.println("\n-----Sorted Data------");
		employee.stream().sorted((e1,e2)->e1.getName().compareToIgnoreCase(e2.getName())).map(x->x).forEach(e->System.out.println(e));
		
		System.out.println("\n-----Distinct department------");
		employee.stream().map(Employee::getDept).distinct().forEach(s->System.out.println(s));
		
		System.out.println("\n-----No of employee working in each dept-----");
		Map<String, Long> empInEachDept = employee.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		System.out.println(empInEachDept);
		
		System.out.println("\n-----All the employee list of HR department-----");
		employee.stream().filter(emp->emp.getDept().equals("HR")).forEach(e->System.out.println(e));
		
		System.out.println("\n-----sort employee based on salary desc order-----");
		employee.stream().sorted((e1,e2)->e2.getSalary()-e1.getSalary()).forEach(s->System.out.println(s));
		
		System.out.println("\n-----nth(3rd) highest salary-----");
		Optional<Integer> ThirdHighestSal = employee.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(2).findFirst();
		System.out.println(ThirdHighestSal.get());
	}
}
