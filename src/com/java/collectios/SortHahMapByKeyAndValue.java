package com.java.collectios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHahMapByKeyAndValue {
	public static void main(String[] args) {
		Map<Integer, String> hashmap = new HashMap<>();
		hashmap.put(22, "A");
		hashmap.put(55, "B");
		hashmap.put(33, "Z");
		hashmap.put(44, "M");
		hashmap.put(99, "I");
		hashmap.put(88, "X");
		
		System.out.println("sort based on key");
		Set<Entry<Integer, String>> entrySet = hashmap.entrySet();
		List<Entry<Integer, String>> list=new ArrayList<>(entrySet);
		Collections.sort(list,new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getKey()-o2.getKey();
			}
		});
		list.forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
		
		System.out.println("sort based on value");
		Set<Entry<Integer, String>> entrySet1 = hashmap.entrySet();
		List<Entry<Integer, String>> list1=new ArrayList<>(entrySet1);
		Collections.sort(list1,new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		list1.forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
	}
}
