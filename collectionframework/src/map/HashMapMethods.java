package map;

import java.util.HashMap;
import java.util.Set;

public class HashMapMethods {

	public static void main(String[] args) {
		HashMap<Integer,String> HM=new HashMap();
		HM.put(1,"A");
		HM.put(4,"D");
		HM.put(5,"E");
		HM.put(2,"B");
		HM.put(3,null);
		System.out.println(HM);
		System.out.println(HM.put(6, "F"));   // if new entry add return null
		System.out.println(HM.put(5,"e"));		// old key override return old value of key
		System.out.println(HM);
		System.out.println(HM.containsKey(2));       // return bool if specific key present
		System.out.println(HM.entrySet());
		System.out.println(HM.get(2));  // return value of key
		
		System.out.println(HM.getOrDefault(5,"X")); // if key has value then return or return specified defualt value
		
		System.out.println(HM.putIfAbsent(3, "C"));
		Set<Integer> s=HM.keySet();			// return list of keys
		System.out.println(s);
		System.out.println(HM.values());		// return list of values
		HM.remove(3, "T");   	// It will remove only key have mentioned value
		System.out.println(HM);
		HM.remove(3, "C");
		System.out.println(HM);
	
	
	}

}
