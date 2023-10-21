package com.java.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTest {

	private static void serializeObject(Student st1) {
		try {
			FileOutputStream fo=new FileOutputStream(new File("student.dat"));
			ObjectOutputStream oos=new ObjectOutputStream(fo);
			oos.writeObject(st1);
			System.out.println("object is serialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void deserializeObj() {
		try {
			FileInputStream fi=new FileInputStream("student.dat");
			ObjectInputStream ois=new ObjectInputStream(fi);
			Student studentData=(Student) ois.readObject();
			System.out.println("deserialize Data: "+studentData);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Student st1=new Student(1, "akash kumar", "akashkumar972177@gmail.com", "CGCTC");
		serializeObject(st1);
		deserializeObj();
		
	}
}
