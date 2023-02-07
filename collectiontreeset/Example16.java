//16. Write a Java program to remove a given element from a tree set.  
package collectiontreeset;

import java.util.TreeSet;

public class Example16 {

	public static void main(String[] args) {
		TreeSet<Integer> Rollno=new TreeSet<Integer>();
		Rollno.add(10);
		Rollno.add(15);
		Rollno.add(1);
		Rollno.add(3);
		Rollno.add(4);
		
		System.out.println(Rollno.remove(4));
		System.out.println(Rollno);
	

	}

}
