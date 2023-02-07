//3. Write a Java program to get the number of elements in a hash set.  
package collectionhashset;

import java.util.HashSet;

public class Example3 {

	public static void main(String[] args) {
		HashSet<String> Color=new HashSet<String>();		
		Color.add("Orange");
		Color.add("Red");
		Color.add("Blue");
		Color.add("Black");
		Color.add("White");
		
		System.out.println(Color);
		System.out.println(Color.size());
	
	}

}
