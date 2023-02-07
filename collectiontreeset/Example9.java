//9. Write a Java program to find the numbers less than 7 in a tree set.  

package collectiontreeset;

import java.util.TreeSet;

public class Example9 {

	public static void main(String[] args) {
		TreeSet<Integer> Rollno=new TreeSet<Integer>();
		Rollno.add(10);
		Rollno.add(15);
		Rollno.add(1);
		Rollno.add(3);
		Rollno.add(4);
		
		System.out.println(Rollno.headSet(7));

	}

}
