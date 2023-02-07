//2. Write a Java program to iterate through all elements in a tree set.  
package collectiontreeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Example2 {

	public static void main(String[] args) {
		TreeSet<String> Color=new TreeSet<String>();
		Color.add("Orange");
		Color.add("Red");
		Color.add("Blue");
		Color.add("Black");
		Color.add("White");
		
		System.out.println(Color);
		Iterator<String> T=Color.iterator();
		for(String i:Color) {
			System.out.println(i);
		}

	}

}
