//10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.  

package collectiontreeset;

import java.util.TreeSet;

public class Example10 {

	public static void main(String[] args) {
		TreeSet<Integer> Rollno=new TreeSet<Integer>();
		Rollno.add(10);
		Rollno.add(15);
		Rollno.add(1);
		Rollno.add(3);
		Rollno.add(4);
		
		System.out.println(Rollno.tailSet(7));
	}

}
