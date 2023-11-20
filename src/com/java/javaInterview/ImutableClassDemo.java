package com.java.javaInterview;

import java.util.ArrayList;
import java.util.List;

public final class ImutableClassDemo {

	private final long id;
	private final String name;
	private final List<String> tokens;

	public ImutableClassDemo(long id, String name, List<String> tokens) {
		super();
		this.id = id;
		this.name = name;
		this.tokens = tokens;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

    //  Notice that we are returning a new copy of ArrayList from the getTokens() method. By doing so, we are hiding the 
	//  original tokens list so no one can even get a reference of it and change it.     
	public List<String> getTokens() {
		return new ArrayList<>(tokens);
	}

	@Override
	public String toString() {
		return "ImutableClassDemo [id=" + id + ", name=" + name + ", tokens=" + tokens + "]";
	}
	
	
	public static void main(String[] args) {
		List<String> tokens=new ArrayList<>();
		tokens.add("token1");
		ImutableClassDemo idemo=new ImutableClassDemo(1, "akash",tokens);
		System.out.println(idemo);
		
		idemo.getTokens().add("token2");
		System.out.println(idemo);
	}

}
