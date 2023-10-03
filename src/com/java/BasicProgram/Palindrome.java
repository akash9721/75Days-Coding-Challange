package com.java.BasicProgram;

public class Palindrome {
	
	private static void palindronOfString(String str) {
		String str2="";
        for(int i=str.length()-1;i>=0;i--) {
      	  str2+=str.charAt(i);
        }
        String resultString= str.equals(str2)?"Palindrone":"Not palindrone";
        System.out.println(resultString);
	}
	
	private static void palindronOfInteger(int num) {
		int temp=num;
		int res=0;
		while(num!=0) {
			int rem=num%10;
			res=res*10+rem;
			num=num/10;
		}
		String resNum= (res==temp)?"palindron":"Not palindrone";
		System.out.println(resNum);
		
	}
	
	public static void main(String[] args) {
          String str="madan";
          palindronOfString(str);
          palindronOfInteger(1221);
	}



	
}
