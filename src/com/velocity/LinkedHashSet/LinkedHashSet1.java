package com.velocity.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {

	public static void main(String[] args) {

		Set lhs=new LinkedHashSet();
		// how to add elements into linkedhashset
		lhs.add(15);
		lhs.add(50);
		lhs.add(25); //this one
		lhs.add(80);
		lhs.add(25); //duplicate not added
		lhs.add("mumbai"); //heterogenous object 
		lhs.add(null); //null insertion is possible
		//1st way- direct way
		System.out.println(lhs);
	}
}
