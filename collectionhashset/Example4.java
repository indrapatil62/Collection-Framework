//4. Write a Java program to empty an hash set
package collectionhashset;

import java.util.HashSet;

public class Example4 {

	public static void main(String[] args) {
		HashSet<String> Color=new HashSet<String>();		
		Color.add("Orange");
		Color.add("Red");
		Color.add("Blue");
		Color.add("Black");
		Color.add("White");
		
		System.out.println(Color);
		Color.clear();
		System.out.println(Color);
	}

}
