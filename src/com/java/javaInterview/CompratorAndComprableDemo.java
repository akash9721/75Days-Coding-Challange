package com.java.javaInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompratorAndComprableDemo {

	public static void main(String[] args) {
		
		Student s1=new Student(8, "akash", "kumar");
		Student s2=new Student(2, "vikash", "kumar");
		Student s3=new Student(5, "sachin", "singh");
		Student s4=new Student(3, "charan", "gupta");
		Student s5=new Student(1, "priyanka", "chaurasiya");
		
		List<Student> students=Arrays.asList(s1,s2,s3,s4,s5);
		students.stream().forEach(System.out::println);
		System.out.println();
		for(Student st:students) {
			System.out.println(st+" ");
		}
		
		System.out.println("\n Sort element based on id using comparable");
		Collections.sort(students);
		students.stream().forEach(System.out::println);
		
//		System.out.println("\nSorted element based on id");
//		Collections.sort(students,new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getId()-o2.getId();
//			}
//		});
//		students.stream().forEach(System.out::println);
//		
//		System.out.println("\n Sorted element based on firstname");
//		Collections.sort(students,new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getFirstName().compareTo(o2.getFirstName());
//			}
//		});
//		students.stream().forEach(System.out::println);
	}
}
