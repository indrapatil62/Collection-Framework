//8. Write a Java program to compare two tree sets. 

package collectiontreeset;

import java.util.TreeSet;

public class Example8 {

	public static void main(String[] args) {
		TreeSet<String> Color=new TreeSet<String>();
		Color.add("Orange");
		Color.add("Red");
		Color.add("Blue");
		Color.add("Black");
		Color.add("White");
		
		TreeSet<String> Color1=new TreeSet<String>();
		Color1.add("Orange");
		Color1.add("Red");
		Color1.add("Blue");
		Color1.add("Black");
		Color1.add("White");
		
		System.out.println(Color.equals(Color1));
	}

}
