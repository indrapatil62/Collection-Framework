//5. Write a Java program to test a hash set is empty or not.  
package collectionhashset;

import java.util.HashSet;

public class Example5 {

	public static void main(String[] args) {
		HashSet<String> Color=new HashSet<String>();		
		Color.add("Orange");
		Color.add("Red");
		Color.add("Blue");
		Color.add("Black");
		Color.add("White");
		
		System.out.println(Color.isEmpty());

	}

}
