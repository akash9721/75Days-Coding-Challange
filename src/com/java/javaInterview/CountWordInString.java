package com.java.javaInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountWordInString {
	public static void main(String[] args) {
		String str = "This this is is done by Saket Saket";
		str=str.toLowerCase();
		String[] newStr=str.split(" ");
		Map<String, Integer> storeMap=new HashMap<>();
		for(int i=0;i<newStr.length;i++) {
			if(storeMap.containsKey(newStr[i])) {
				storeMap.put(newStr[i],storeMap.get(newStr[i])+1);
			}
			else {
				storeMap.put(newStr[i], 1);
			}
		}
		//iterate using for each
		//storeMap.forEach((k,v)->System.out.println(k+" ->"+v));
		
		//iterate using for
		for(Map.Entry en2:storeMap.entrySet()) {
			System.out.println(en2.getKey()+"->   "+en2.getValue());
		}
		
		//iterate using while loop
		System.out.println();
		 java.util.Iterator<Entry<String, Integer>> iterator = storeMap.entrySet().iterator();
		 while(iterator.hasNext()) {
			 Entry<String, Integer> en2=iterator.next();
			 System.out.println(en2.getKey()+" ->"+en2.getValue());
		}
		 
		 System.out.println("sort based on key");
		 Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		 
		 List<Entry<String, Integer>> list=new ArrayList<>(entrySet);
		 Collections.sort(list,(a, b) -> a.getKey().compareTo(b.getKey()));
		 list.forEach(s->System.out.println(s.getKey()+" "+s.getValue()));
	}

}
