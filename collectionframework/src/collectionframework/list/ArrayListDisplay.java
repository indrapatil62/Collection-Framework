package collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDisplay {

	public static void main(String[] args) {
		ArrayList<Float> list=new ArrayList<Float>();
		list.add(91.5f);
		list.add(90.5f);
		list.add(89.0f);
		list.add(80.75f);
		list.add(90.55f);
		System.out.println(list);
		/// Iterate Method 1
		for(float i:list) {
			System.out.println(i);
		}
		System.out.println("--------------------");
		///Iterate Method 2
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------------");
		///Iterate Method 3
		ListIterator<Float> list1=list.listIterator();
		while(list1.hasNext()) {
			System.out.println(list1.next());
		}
	}

}
