//12. Write a Java program to remove all of the elements from a hash set. 

package collectionhashset;

import java.util.HashSet;

public class Example12 {

	public static void main(String[] args) {
		HashSet<String> Color=new HashSet<String>();
		Color.add("Orange");
		Color.add("Red");
		Color.add("Blue");
		Color.add("Black");
		Color.add("White");
		
		
//		Color.clear();
		Color.removeAll(Color);
		System.out.println(Color);
	}

}
