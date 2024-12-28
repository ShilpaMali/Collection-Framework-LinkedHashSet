package com.velocity.LinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

//Generics Integer
public class LinkedHashSet4 {

	public static void main(String[] args) {

		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		// how to add elements into hashset
		hs.add(15);
		hs.add(50);
		hs.add(25);
		hs.add(80);
		// 2nd way- using iterator
		Iterator<Integer> itr = hs.iterator(); //itr contain 15 50 25 80
		while (itr.hasNext()) {
			System.out.println(itr.next()); //15 50 25 80
		}
	}
}
