package queue;

import java.util.PriorityQueue;



public class PriorityQueueMethods {

	public static void main(String[] args) {
		PriorityQueue<String> PQueue=new PriorityQueue<>();
		PQueue.add("I");
		PQueue.add("N");
		PQueue.add("D");
		PQueue.add("R");
		PQueue.add("A");
		
		System.out.println(PQueue);
		System.out.println(PQueue.element()); //Retrieves, but does not remove,head element.
		PQueue.offer("J");
		System.out.println(PQueue);// insert element
	
		}

}
