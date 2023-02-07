//11. Write a Java program to compare two sets and retain elements which are same on both sets. 
package collectionhashset;

import java.util.HashSet;

public class Example11 {

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
		
		Color.retainAll(Color2);
        System.out.println("HashSet content:");
        System.out.println(Color);
	}

}
