//1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.  

package collectiontreeset;

import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		TreeSet<String> Color=new TreeSet<String>();
		Color.add("Orange");
		Color.add("Red");
		Color.add("Blue");
		Color.add("Black");
		Color.add("White");
		
		System.out.println(Color);

	}

}
