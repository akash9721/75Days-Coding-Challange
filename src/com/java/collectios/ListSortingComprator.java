package com.java.collectios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingComprator {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		fruits.add("date");
		
		Collections.sort(fruits,new CustomComparator());
		
		for(String fruit:fruits) {
			System.out.print(fruit+" ");
		}
	}
}
