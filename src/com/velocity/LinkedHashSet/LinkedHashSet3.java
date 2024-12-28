package com.velocity.LinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet3 {

	public static void main(String[] args) {

		LinkedHashSet hs=new LinkedHashSet();
		// how to add elements into hashset
		hs.add(15);
		hs.add(50);
		hs.add(25);
		hs.add(80);
		//3rd way- for each loop
		for(Object obj:hs) {
			System.out.println(obj);
		}
	}
}
