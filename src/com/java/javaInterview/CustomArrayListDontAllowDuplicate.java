package com.java.javaInterview;

import java.util.ArrayList;

public class CustomArrayListDontAllowDuplicate extends ArrayList {

	@Override
	public boolean add(Object obj) {
		// if this object is already there then return true
		if (this.contains(obj)) {
			return true;
		} else {
			//else just add it
			return super.add(obj);
		}
	}

	public static void main(String[] args) {
       
		CustomArrayListDontAllowDuplicate customobj=new CustomArrayListDontAllowDuplicate();
		customobj.add(1);
		customobj.add(2);
		customobj.add(2);
		customobj.add(3);
		customobj.add(1);
		System.out.println(customobj);
	}
}
