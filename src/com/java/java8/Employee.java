package com.java.java8;

public class Employee {

	private String name;
	private int age;
	private String gender;
	private String dept;
	private int salary;
	
	public Employee(String name, int age, String gender, String dept, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept + ", salary="
				+ salary + "]";
	}
	
	
	
	
	
}
