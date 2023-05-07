package part3;

import java.util.*;
public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Object> h=new HashMap<Integer,Object>();
		h.put(1,"anu");
		h.put(6,"anam");
		h.put(3,"ana");
		h.put(4, "jann");
		h.put(3, "sam");
		h.put(5, null);
		h.put(4, "jkl");
		//h.put(null, null);
		//h.put(null, "bnm");
		System.out.println(h.entrySet());
		//System.out.println(h.values());
	   // System.out.println(h.keySet());
	    
	    Set<Object> s=(Set)h.entrySet();
	    
	    Iterator<Object> i=s.iterator();
	    while(i.hasNext())
	    {
	  	  System.out.println(i.next());
	    }

	    
	   // System.out.println(h);
	    
	   

	}

}
