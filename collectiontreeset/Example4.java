// 4. Write a Java program to create a reverse order view of the elements contained in a given tree set. 

package collectiontreeset;

import java.util.TreeSet;

public class Example4 {

	public static void main(String[] args) {
		TreeSet<String> Color=new TreeSet<String>();
		Color.add("Orange");
		Color.add("Red");
		Color.add("Blue");
		Color.add("Black");
		Color.add("White");
		System.out.println("Original set :"+Color);
		System.out.println("Reversed set :"+Color.descendingSet());
	}
}
