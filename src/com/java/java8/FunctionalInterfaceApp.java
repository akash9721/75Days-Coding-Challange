package com.java.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceApp {

	public static void main(String[] args) {
		
		//creating our own functional interface
		FunctionalInterfaceDemo fdemo=x->x*x;
		System.out.println("square of 5 is "+fdemo.square(5));
		
		
		//predefined functional interface
		Consumer<Integer> consumer=x->System.out.println("square of 6 is "+x*x);
		consumer.accept(6);
		
		Predicate<String> predicate=(str)->str.length()>4;
		System.out.println(predicate.test("akash"));
		
		Function<Integer, Integer> function=x->x*x;
		System.out.println(function.apply(7));
	}
}
