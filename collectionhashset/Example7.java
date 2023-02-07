//7. Write a Java program to convert a hash set to an array.  
package collectionhashset;

import java.util.HashSet;

public class Example7 {

	public static void main(String[] args) {
		HashSet<String> Color=new HashSet<String>();
		Color.add("Orange");
		Color.add("Red");
		Color.add("Blue");
		Color.add("Black");
		Color.add("White");
		
		String Array1[]=new String [Color.size()];
		for (int i=0;i<Color.size();i++) {
			for(String j:Color) {
			Array1[i]=j;
			}
		}
		for(String k:Color) {
			System.out.println(k);
			}
		
	}

}
