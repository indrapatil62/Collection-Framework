package collectionframework.list;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList<String> Name=new LinkedList<String>();
		// Linkedlist is used when we have multi time add and removal operation
		// It based on Doubly Linked List and Queue.
		// It is not sequential
		// It allows all the list and collection methods
		
		Name.add("A");
		Name.add("B");
		Name.add("C");
		Name.add("D");
		Name.add("E");
		
		System.out.println(Name);
		
		Name.addFirst("I");//// Add to First node
		Name.addLast("Z");// Add to Last node
//		
//		System.out.println(Name.getFirst()); // return First ele
//		
//		System.out.println(Name.getLast()); // return Last ele
//		
//		Name.offer("P");					// Add Last ele
//		System.out.println(Name);
//		
//		Name.offerFirst("N");					// Add First ele
//		System.out.println(Name);
//		
//		Name.offerLast("Q");				// Add Last ele
//		System.out.println(Name);
//	
//		System.out.println(Name.peek());	// return First ele
//	
//		System.out.println(Name.peekFirst());	// return First ele
//		
//		System.out.println(Name.peekLast());	// return Last ele
//		
//		System.out.println(Name.poll());			// Return And Remove the First Element
//		System.out.println(Name);
//		
//		System.out.println(Name.pollFirst());			// Return And Remove the First Element
//		System.out.println(Name);
//		
//		System.out.println(Name.pollLast());			// Return And Remove the Last Element
//		System.out.println(Name);
//		
//		System.out.println(Name.pop());					// Return And Remove the First Element
//		System.out.println(Name);	
//		
//		System.out.println(Name.remove());			// Return And Remove the First Element
//		System.out.println(Name);	
		
		System.out.println(Name.remove("A"));			// Return  Boolean if Per ele mention  And Remove the Element
		System.out.println(Name);					// if not mention then it remove first ele
		
//		System.out.println(Name.removeFirst());			// Return And Remove the First Element
//		System.out.println(Name);
//		
//		System.out.println(Name.removeFirstOccurrence("B"));			// Return And Remove the First Element
//		System.out.println(Name);
		
	}
	

}
