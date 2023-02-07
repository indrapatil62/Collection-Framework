//15. Write a Java program to retrieve and remove the last element of a tree set. 
package collectiontreeset;

import java.util.TreeSet;

public class Example15 {

	public static void main(String[] args) {
		TreeSet<Integer> Rollno=new TreeSet<Integer>();
		Rollno.add(10);
		Rollno.add(15);
		Rollno.add(1);
		Rollno.add(3);
		Rollno.add(4);
		
		System.out.println(Rollno.pollLast());
		System.out.println(Rollno);
	}

}
