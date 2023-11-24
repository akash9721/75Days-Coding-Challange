package com.java.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Questions_I {

	public static void main(String[] args) {
		 List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");
		 
		 //1. Count Strings whose length is greater than 3 in List?
		 long count = stringList.stream().filter(x->x.length()>3).count();
		 System.out.println("Strings whose length is greater than 3 in List "+count);
		 
		//2. Print Strings whose length is greater than 3 in List?
		 stringList.stream().filter(x->x.length()>3).forEach(System.out::println);
		 
		 
		 String input = "Java articles are Awesome";
		 //1. find the first non-repeated character in it using Stream functions?
		 for(char ch:input.toCharArray()) {
			 if(input.indexOf(ch)==input.lastIndexOf(ch)) {
				 System.out.println(ch);
				 break;
			 }
		 }
		 
		 
		 //2.  find the first repeated character in it using Stream functions? a
		 
		 List<String> names = Arrays.asList("aa", "bb", "cc", "aa");
		 //How to use map to convert object into Uppercase in Java 8?
		 System.out.println("\nconvert object into Uppercase");
		 names.stream().map(x->x.toUpperCase()).forEach(s->System.out.print(s+" "));
		 names.stream().map(String::toUpperCase).forEach(s->System.out.print(s+" "));
		 
		 List<String> name1 = Arrays.asList("AA", "BB", "AA", "CC","DD","BB");
		 //count each element/word from the String ArrayList in Java8?
		 System.out.println("\ncount each element/word from the String ArrayList");
		 Map<String, Long> countFreq = name1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(countFreq);
		 
		 //How to find only duplicate elements with its count more than 1 String ArrayList in Java8?
		 System.out.println("\nfind only duplicate elements with its count more than 1");
		 Map<String, Long> countFreqMorethan1 = name1.stream().filter(x->Collections.frequency(name1, x)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(countFreqMorethan1);
		 
		 
		 
		 String s = "string data to count each character";
		 //Write a program to print the count of each character in a String?
		 System.out.println(s);
		 Map<String, Long> val1 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(val1);
		 String str=s.replaceAll(" " , "");
		 System.out.println(str);
		 Map<String, Long> val2 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(val2);
		 
		 
		 
	}
}
