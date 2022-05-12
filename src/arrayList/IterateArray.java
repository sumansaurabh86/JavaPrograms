package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArray {

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("Size of ArrayList: " + list.size());
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
