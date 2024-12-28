package com.velocity.LinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
//generic Integer
public class LinkedHashSet5 {

	public static void main(String[] args) {

		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		// how to add elements into hashset
		hs.add(15);
		hs.add(50);
		hs.add(25);
		hs.add(80);
		//3rd way- for each loop
		for(Integer i:hs) {
			System.out.println(i);
		}
	}
}
