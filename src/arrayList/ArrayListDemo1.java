package arrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Object> l = new ArrayList<Object>();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
//		for(Object obj:l) {
//			System.out.println(obj);
//		}
		System.out.println(l);
		l.set(3, "suman"); 	//set is used to replace the value at given index 
		
		l.remove(2);
		System.out.println(l);
		
		l.add(2, "M");
		l.add("N");
		System.out.println(l);
		
		
		

	}

}
