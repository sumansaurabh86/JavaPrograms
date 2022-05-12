package arrayList;

import java.util.ArrayList;

public class AddTwoArrayList {

	public static void main(String[] args) {
		
		// create an ArrayList
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Java");
		list1.add("Python");
		list1.add("Ruby");
		System.out.println("Progamming language: " + list1);
		
		// create another ArrayList
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("Hindi");
		list2.add("English");
		list2.add("Bengali");
		
		// add all elements of list1 to list2
		list2.addAll(list1);
		System.out.println("All languages are: " + list2);

	}

}
