//9. Write a Java program to convert a hash set to a List/ArrayList.  

package collectionhashset;

import java.util.ArrayList;
import java.util.HashSet;


public class Example9 {

	public static void main(String[] args) {
		HashSet<String> Color=new HashSet<String>();
		Color.add("Orange");
		Color.add("Red");
		Color.add("Blue");
		Color.add("Black");
		Color.add("White");
		
		ArrayList<String> Color2=new ArrayList<String>(Color);
		System.out.println(Color2);
	}

}
