package collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayListMethod {

	public static void main(String[] args) {
		ArrayList<Float> list1=new ArrayList<Float>();
		list1.add(91.5f);
		list1.add(90.5f);
		list1.add(89.0f);
		list1.add(80.75f);
		list1.add(90.55f);
		
		ArrayList<Float> list2=new ArrayList<Float>();
		list2.add(56.5f);
		list2.add(34.5f);
		list2.add(78.0f);
		
		System.out.println(list1);
		list1.ensureCapacity(10);
		list1.add(1, 55.65f);
		System.out.println(list1);
		System.out.println("Addall");
		list1.addAll(list2);
		System.out.println(list1);
		System.out.println("Addall with index");
		list1.addAll(2, list2);
		System.out.println(list1);
		System.out.println("hashcode");
		list1.hashCode();
		System.out.println(list1);
		System.out.println("Check exist or not \n"+list1.contains(56.5f));
		System.out.println("------------------------");
		System.out.println("Check object is exist or not \n"+list1.containsAll(list2));
		System.out.println("------------------------");
		System.out.println(" Check equals \n"+list1.equals(list2));
		System.out.println("------------------------");
		System.out.println("Display \n"+list1.get(0));
		System.out.println("------------------------");
		System.out.println("Check isEmpty or not \n"+list1.isEmpty());
		System.out.println("------------------------");
		Iterator itr= list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			// Iterator is interface used for iterator
		}
		System.out.println("------------------------");
		System.out.println("Last Index of Ele if not then -1 \n"+list1.lastIndexOf(78.0f));
//		System.out.println("------------------------");
//		System.out.println("listiterator \n "+list1.listIterator());
		System.out.println("------------------------");
		System.out.println("First Index of Ele if not then -1 \n"+list1.indexOf(76.0f));
		System.out.println("------------------------");
		System.out.println("Return Size of list \n"+list1.size());
		System.out.println("------------------------");
		System.out.println("Remove perticular element (if only present if not unchanged) \n"+list1.remove(78.0f));
		System.out.println("------------------------");
		System.out.println("Set or add value to perticular index \n"+list1.set(5, null));
		System.out.println("------------------------");
		ArrayList<Float> list21=new ArrayList<Float>();
		list21=(ArrayList<Float>) list1.clone();
		System.out.println("List1 (original list) \n"+list1);
		System.out.println("Clone the list(Shallow Copy) \n"+list21);
//		System.out.println("------------------------");
//		System.out.println("iterate form perticular index \n"+list1.listIterator(5));
		System.out.println("------------------------");
		System.out.println("It accept condition for remove which in para \n"+list1.removeIf(null));
		System.out.println("------------------------");
		System.out.println("Remove all element form list1 except ele of list 2\n"+list1.retainAll(list2));
		System.out.println("------------------------");
		list21.trimToSize();
		//it will trim unfilled index
		System.out.println("------------------------");
		System.out.println("Split Iterator \n"+list1.spliterator());
		System.out.println("------------------------");
		System.out.println(list1);
		System.out.println("Return The perticular sublistform given index  \n"+list21.subList(2, 6));
		System.out.println(list1);
		System.out.println("------------------------");
		Object []names=list21.toArray();
		// Every Element in collection is an object
		System.out.println("Return The perticular list in sequence  \n"+names);
		System.out.println("------------------------");
		System.out.println(list21);
		System.out.println("Sort the list ");
		Collections.sort(list21);
		list21.sort(null);
		System.out.println("------------------------");
		list1.ensureCapacity(2);
		// It will reduce time complexisity for JVM to calculate capacity this method will min capacity
		
		
			
		
	}
}

