//5. Write a Java program to get the first and last elements in a tree set 
package collectiontreeset;

import java.util.TreeSet;

public class Example5 {

	public static void main(String[] args) {
		TreeSet<String> Color=new TreeSet<String>();
		Color.add("Orange");
		Color.add("Red");
		Color.add("Blue");
		Color.add("Black");
		Color.add("White");
		System.out.println(Color);
		System.out.println(Color.first());
		System.out.println(Color.last());
	}

}
