package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		System.out.println("Size of ArrayList: " + list.size());
		
		Iterator<Integer> itr = list.iterator();	// iterator() method returns Iterator object
		while(itr.hasNext())
		{
			Integer value = itr.next();
			System.out.println(value);
			
			if(value.equals(30)) {
			itr.remove();
			}
		}
		System.out.println(list);
	}
}
