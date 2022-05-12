package com.demo.suman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionListExample {

	
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Suman");
		l.add("Aanand");
		l.add("Subash");
		l.add("Amit");
		l.add("Ravi");
		
		System .out.println("Before Sorting:");
		for (String names : l) {
			System .out.println(names);
		}
		
		
		Collections.sort(l);
		System .out.println("After Sorting:");
		for (String names : l) {
			System .out.println(names);
		}
	}
	
}
