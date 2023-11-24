package com.java.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8Questions_II {

	public static void main(String[] args) {
		
		List<Integer> element=Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		//1.find out all the even numbers that exist in the list using Stream functions?
		System.out.println("all the even numbers");
		List<Integer> evenNum = element.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(evenNum);
		
		//2.find out all the numbers starting with 1 using Stream functions?
		System.out.println("\nnumbers starting with 1");
		element.stream().map(x->x+"").filter(x->x.startsWith("1")).forEach(s->System.out.print(s+" "));
		
		//3. find duplicate elements in a given integers list in java using Stream functions?
		System.out.println("\nduplicate elements in a given integers list");
		Set<Integer> set=new HashSet<>();
		element.stream().filter(x->!set.add(x)).forEach(s->System.out.print(s+" "));
		
        //4.  find the first element of the list using Stream functions?
		System.out.println("\nfirst element of the list");
		element.stream().findFirst().ifPresent(System.out::println);
		
		//5. find the total number of elements present in the list using Stream functions?
		System.out.println("total number of elements present in the list");
		long count = element.stream().count();
		System.out.println(count);
		
		//6. find the maximum value element present in it using Stream functions?
		System.out.println("maximum value element present in it");
		int maxNum = element.stream().mapToInt(x->x).max().getAsInt();
		System.out.println(maxNum);
		Integer num = element.stream().max((x,y)->x-y).get();
		System.out.println(num);
		Integer maxnum = element.stream().max(Integer::compare).get();
		System.out.println(maxnum);
		
		//7. sort all the values present in it using Stream functions?
		System.out.println("sort all the values present in it in ascending");
		element.stream().sorted().forEach(s->System.out.print(s+" "));
		
		System.out.println("\nsort all the values present in it in descending");
		element.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.print(s+" "));
		
		System.out.println();
		 List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
		 //1.  program to perform cube on list elements and filter numbers greater than 50.
		 System.out.println("\nperform cube on list elements and filter numbers greater than 50");
		 integerList.stream().map(x->x*x*x).filter(x->x>50).forEach(s->System.out.print(s+" "));
		 
		
		
		
		
		
		
	}
}
