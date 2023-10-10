package com.java.collectios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SerializeHashMap{
	
	private static void serialization(Map<Integer, String> hashmap) throws IOException {
		FileOutputStream fos=new FileOutputStream("hashmap.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(hashmap);
		System.out.println("hashmap is serilize");	
	}
	
	private static void deserialization() throws IOException, ClassNotFoundException {
		HashMap<Integer, String> map=null;
		FileInputStream fis=new FileInputStream("hashmap.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		map=(HashMap)ois.readObject();
		
		for(Map.Entry entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
    public static void main(String[] args) throws IOException, ClassNotFoundException {
		Map<Integer, String> hashmap=new HashMap<>();
		hashmap.put(22, "A");
		hashmap.put(55, "B");
		hashmap.put(33, "Z");
		hashmap.put(44, "M");
		hashmap.put(99, "I");
		hashmap.put(88, "X");
		
		serialization(hashmap);
		deserialization();
		

	}

}
