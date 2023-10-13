package com.java.javaInterview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CountCharacterInWord {
	public static void main(String[] args) {
        String str="Akash";
        str=str.toLowerCase();
        Map<Character, Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++) {
        	if(map.containsKey(str.charAt(i))) {
        		map.put(str.charAt(i), map.get(str.charAt(i))+1);
        	}
        	else {
        		map.put(str.charAt(i), 1);
        	}
        }
        
        Iterator<Entry<Character, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
        	Map.Entry entry=iterator.next();
        	System.out.println(entry.getKey()+" ->"+entry.getValue());
        }
	}
}
