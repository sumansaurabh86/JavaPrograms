package com.demo.suman;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		SortedSet<String> s1= new TreeSet<>();
		s1.add("Suman");
		s1.add("Amit");
		s1.add("Anand");
		s1.add("Ravi");
		
		/*for (Iterator iterator = s1.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
		}*/
		
		Iterator<String> setIterator = s1.iterator();
		while (setIterator.hasNext()) {
			String str = setIterator.next();
			System.out.println(str);
			
		}
		

	}

}
