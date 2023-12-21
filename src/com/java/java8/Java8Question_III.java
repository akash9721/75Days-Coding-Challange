package com.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Question_III {
    public static void main(String[] args) {
		//find length of longest string
    	String[] fruits= {"banana","apple","avocado","pineapple","grapes"};
    	String longestString = Arrays.asList(fruits).stream().reduce((str1,str2)->str1.length()>str2.length()?str1:str2).get();
    	System.out.println(longestString);
    	
    	//second smallest no
    	int[] nums= {5,2,8,3,1};
    	int secSmallNo = Arrays.stream(nums).sorted().skip(1).findFirst().getAsInt();
    	System.out.println("second small no :"+secSmallNo);
    	
    	//find common element between 2 array
    	int[] array1= {1,2,3,4,5};
    	int[] array2= {4,5,6,7,8,1};
    	List<Integer> commonElement = Arrays.stream(array1).filter(nums1->Arrays.stream(array2).anyMatch(nums2->nums2==nums1)).boxed().collect(Collectors.toList());
    	System.out.println(commonElement);
    	
	}
}
