//3. Write a Java program to add all the elements of a specified tree set to another tree set. 

package collectiontreeset;

import java.util.TreeSet;

public class Example3 {

	public static void main(String[] args) {
		TreeSet<String> Color=new TreeSet<String>();
		Color.add("Orange");
		Color.add("Red");
		Color.add("Blue");
		Color.add("Black");
		Color.add("White");
		TreeSet<String> Color1=new TreeSet<String>(Color);
		System.out.println("Treeset 1 : "+Color);
		System.out.println("Treeset 2 : "+Color1);
	}

}
