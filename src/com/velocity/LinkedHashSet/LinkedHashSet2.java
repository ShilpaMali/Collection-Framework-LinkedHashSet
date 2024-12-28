package com.velocity.LinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {

	public static void main(String[] args) {

		LinkedHashSet hs = new LinkedHashSet();
		// how to add elements into hashset
		hs.add(15);
		hs.add(50);
		hs.add(25);
		hs.add(80);
		//2nd way- using iterator
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
