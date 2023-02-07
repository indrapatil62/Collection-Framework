//6. Write a Java program to clone a tree set list to another tree set 
package collectiontreeset;

import java.util.TreeSet;

public class Example6 {

	public static void main(String[] args) {
		TreeSet<String> Color=new TreeSet<String>();
		Color.add("Orange");
		Color.add("Red");
		Color.add("Blue");
		Color.add("Black");
		Color.add("White");
		System.out.println("Original Set :"+Color);
		TreeSet<String> Color1=(TreeSet<String>) Color.clone();
		System.out.println("clone set :"+Color1);
	}

}
