//8. Write a Java program to convert a hash set to a tree set.  

package collectionhashset;

import java.util.HashSet;
import java.util.TreeSet;

public class Example8 {

	public static void main(String[] args) {
		HashSet<String> Color=new HashSet<String>();
		Color.add("Orange");
		Color.add("Red");
		Color.add("Blue");
		Color.add("Black");
		Color.add("White");
		
		TreeSet<String> Color2=new TreeSet<String>(Color);
		System.out.println(Color2);
	}

}
