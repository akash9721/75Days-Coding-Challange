package com.java.String;

public class implementStrstr {

	private static int implementStrstr(String first, String second) {
	   int cnt=0;
	   int k=0;
	   for(int i=0;i<first.length();i++) {
		   if(first.charAt(i)==second.charAt(k)) {
			   cnt++;
			   k++;
			   if(cnt==second.length()) {
				  return (i-second.length()+1); 
			   }
		   }
		   else {
			   cnt=0;
			   k=0;
		   }
	   }
	   return -1;
	}
	
	public static void main(String[] args) {
		String first="geeksforgeeks";
		String second="for";
		System.out.println("index of second string occurence is "+implementStrstr(first,second));
	}

}
