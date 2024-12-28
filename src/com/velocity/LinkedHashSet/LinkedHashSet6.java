package com.velocity.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet6 {

	// Design method which return linkedhashset object to that method
	public LinkedHashSet<Integer> getLinkedHashSet() {
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		return hs;
	}

	public static void main(String[] args) {

		LinkedHashSet6 hashSetDemo6 = new LinkedHashSet6();
		LinkedHashSet<Integer> hs1 = hashSetDemo6.getLinkedHashSet();
		System.out.println(hs1);
	}
}
