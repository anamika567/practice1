package part3;

import java.util.HashMap;

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashMap<String,Integer> h=new HashMap<String,Integer>();
 
 // insertion
 System.out.println(h.isEmpty());
 h.put("india", 180);
 h.put("us",150);
 h.put("china", 200);
 System.out.println(h);
 
 // updation
 h.put("china", 210);
 System.out.println(h);
 
 System.out.println(h.containsKey("us"));
 System.out.println(h.get("china"));
 System.out.println(h.get("italy"));
 System.out.println(h.entrySet());
 System.out.println(h.values());
 System.out.println(h.keySet()); 
 System.out.println(h.remove("us",150));
 
 System.out.println(h);
	}

}
