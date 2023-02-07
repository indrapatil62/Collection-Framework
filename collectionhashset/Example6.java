//6. Write a Java program to clone a hash set to another hash set.  
package collectionhashset;

import java.util.HashSet;

public class Example6 {

	public static void main(String[] args) {
		HashSet<String> Color=new HashSet<String>();
		Color.add("Orange");
		Color.add("Red");
		Color.add("Blue");
		Color.add("Black");
		Color.add("White");
		System.out.println("Original Set :"+Color);
		HashSet<String> Color1=(HashSet<String>) Color.clone();
		System.out.println("clone set :"+Color1);

	}

}
