//10. Write a Java program to compare two hash set.  

package collectionhashset;

import java.util.HashSet;

public class Example10 {

	public static void main(String[] args) {
		HashSet<String> Color=new HashSet<String>();
		Color.add("Orange");
		Color.add("Red");
		Color.add("Blue");
		Color.add("Black");
		Color.add("White");
		
		HashSet<String> Color2=new HashSet<String>();
		Color2.add("Orange");
		Color2.add("Red");
		Color2.add("Blue");
		Color2.add("Black");
		Color2.add("White");
		
		System.out.println(Color.equals(Color2));

	}

}
