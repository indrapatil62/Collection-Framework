//2. Write a Java program to iterate through all elements in a hash list.  
package collectionhashset;

import java.util.HashSet;
import java.util.Iterator;

public class Example2 {

	public static void main(String[] args) {
		HashSet<String> Color=new HashSet<String>();		
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
