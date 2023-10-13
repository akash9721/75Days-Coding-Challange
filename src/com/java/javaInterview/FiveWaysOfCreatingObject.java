package com.java.javaInterview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FiveWaysOfCreatingObject {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		
		//1. way using new keyword
		Car car=new Car();
		car.setColor("yellow");
		System.out.println(car);
		
		//2. way using clone
		System.out.println();
		Car c2=(Car)car.clone();
		c2.setColor("red");
		System.out.println(c2);
		
		//3. using deserialization
		System.out.println();
		FileOutputStream fos=new FileOutputStream(new File("file.txt"));
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c2);
		System.out.println("object is serialize");
		
		FileInputStream fis=new FileInputStream("file.txt");
		ObjectInputStream oes=new ObjectInputStream(fis);
		Car c3=(Car)oes.readObject();
		c3.setColor("green");
		System.out.println(c3);
		
	}
}
