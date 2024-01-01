package com.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee2App {
	public static void main(String[] args) {
		List<Employee2> employee2List = new ArrayList<Employee2>();

		employee2List.add(new Employee2(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employee2List.add(new Employee2(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employee2List.add(new Employee2(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employee2List.add(new Employee2(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employee2List.add(new Employee2(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employee2List.add(new Employee2(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employee2List.add(new Employee2(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employee2List.add(new Employee2(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employee2List.add(new Employee2(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employee2List.add(new Employee2(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employee2List.add(new Employee2(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employee2List.add(new Employee2(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employee2List.add(new Employee2(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employee2List.add(new Employee2(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employee2List.add(new Employee2(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employee2List.add(new Employee2(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employee2List.add(new Employee2(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		employee2List.stream().forEach(System.out::println);
		
		//1 Find out the count of male and female employees present in the organization?
		long noOfFemaleEmp = employee2List.stream().filter(x->x.getGender().equals("Female")).count();
		long noOfMaleEmp = employee2List.stream().filter(x->x.getGender().equals("Male")).count();
		System.out.println("No of Male employee "+noOfMaleEmp);
		System.out.println("No of Female employee "+noOfFemaleEmp);
		System.out.println("    &&   ");
		employee2List.stream().collect(Collectors.groupingBy(Employee2::getGender,Collectors.counting()))
		.forEach((k,v)->System.out.println(k+" -> "+v));
		
		//2.Write a program to print the names of all departments in the organization.
		System.out.println("\nnames of all departments in the organization");
		employee2List.stream().map(Employee2::getDepartment).distinct().forEach(System.out::println);
		System.out.println("\n");
		employee2List.stream().collect(Collectors.groupingBy(Employee2::getDepartment,Collectors.counting()))
		.forEach((k,v)->System.out.println(k+" ->"+v));
		
		//3. Find the average age of Male and Female Employees.
		System.out.println("\nThe average age of Male and Female Employees");
		Map<String, Double> avgOfMaleandFemale = employee2List.stream().collect(Collectors.groupingBy(Employee2::getGender,Collectors.averagingInt(Employee2::getAge)));
		System.out.println(avgOfMaleandFemale);
		
		//4. Get the Names of employees who joined after 2015.
		System.out.println("\nNames of employees who joined after 2015");
		employee2List.stream().filter(x->x.getYearOfJoining()>2015).map(Employee2::getName).forEach(s->System.out.println(s+" "));
		
		//5.  Count the number of employees in each department.
		System.out.println("\n Count the number of employees in each department");
		employee2List.stream().collect(Collectors.groupingBy(Employee2::getDepartment,Collectors.counting())).forEach((x,y)->System.out.println(x+"-> "+y));
		
		//6. Find out the average salary of each department.
		System.out.println("\naverage salary of each department.");
		employee2List.stream().collect(Collectors.groupingBy(Employee2::getDepartment,Collectors.averagingDouble(Employee2::getSalary))).forEach((x,y)->System.out.println(x+"-> "+y));
		
		//7. Find out the oldest employee, his/her age and department?
		System.out.println("\noldest employee, his/her age and department");
		Employee2 oldestEmployee = employee2List.stream().sorted((e1,e2)->e2.getAge()-e1.getAge()).findFirst().get();
		System.out.println(" employee Name: "+oldestEmployee.getName()+"\n age: "+oldestEmployee.getAge()+"\n department: "+oldestEmployee.getDepartment());
		
		//8. Find out the average and total salary of the organization.
		System.out.println("\naverage and total salary of the organization.");
		Double sumOfSal = employee2List.stream().map(Employee2::getSalary).reduce((sum,currele)->(sum+currele)).get();
		System.out.println("total sal :"+sumOfSal);
		double avgSal = employee2List.stream().mapToDouble(Employee2::getSalary).average().getAsDouble();
		System.out.println("average sal :"+avgSal);
		
		//9.  Find out the high of experienced employees in the organization
		System.out.println("\nhigh of experienced employees in the organization");
		Employee2 expEmp = employee2List.stream().sorted((e1,e2)->e1.getYearOfJoining()-e2.getYearOfJoining()).findFirst().get();
		System.out.println("High experience employee\n");
		System.out.println("Id :"+expEmp.getId());
		System.out.println("Name :"+expEmp.getName());
		System.out.println("Age :"+expEmp.getAge());
		System.out.println("YearOfJoining :"+expEmp.getYearOfJoining());
		
		//10. List down the employees of each department.
        System.out.println("\nList down the employees of each department");
        Map<String, List<Employee2>> emp = employee2List.stream().collect(Collectors.groupingBy(Employee2::getDepartment));
        for(Map.Entry<String, List<Employee2>> entry:emp.entrySet()) {
        	System.out.println("----------------------------");
        	System.out.println("Employee In "+entry.getKey());
        	System.out.println("----------------------------");
        	for(Employee2 em:entry.getValue()) {
        		System.out.println(em.getName());
        	}
        }
        
        System.out.println("++++++++++++++++++++++++++++++++++++");
        emp.entrySet().forEach(it->{
        	System.out.println("Employee In "+it.getKey());
        	it.getValue().forEach(s->System.out.println(s.getName()));
        });
        
        //11. Find the list of students whose age is in between 25 and 30
        System.out.println("Find the list of students whose age is in between 25 and 30");
        List<Employee2> listOfStudent = employee2List.stream().filter(x->x.getAge()>25 && x.getAge()<30).collect(Collectors.toList());
        listOfStudent.forEach(x->System.out.println(x));
        
		
	}

}
