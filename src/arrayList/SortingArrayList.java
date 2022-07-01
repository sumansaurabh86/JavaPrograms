package arrayList;

import java.util.ArrayList;
import java.util.Collections;


public class SortingArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("India");
		list.add("Pakistan");
		list.add("Australia");
		list.add("Japan");
		list.add("America");
		
		System.out.println("Before Sorting: "+ list);
		
		Collections.sort(list);
		System.out.println("After Sorting: "+ list);
		
		
		
		

	}

}
