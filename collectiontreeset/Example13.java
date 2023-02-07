//13. Write a Java program to get an element in a tree set which is strictly less than the given element.  
package collectiontreeset;

import java.util.TreeSet;

public class Example13 {

	public static void main(String[] args) {
		TreeSet<Integer> Rollno=new TreeSet<Integer>();
		Rollno.add(10);
		Rollno.add(15);
		Rollno.add(1);
		Rollno.add(3);
		Rollno.add(4);
		
		System.out.println(Rollno.floor(4));
		System.out.println(Rollno.lower(4));

	}

}
