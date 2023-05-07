package part3;

import java.util.HashSet;
import java.util.Iterator;

public class HashingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating
		HashSet<Integer> h=new HashSet<Integer>();
		 // insert
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
	   // using sop
		System.out.println(h);
		
		//print  using for each loop
		for(Integer i:h)
		{
			System.out.println(i);
		}
		System.out.println();
		// using iterator
		Iterator it=h.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// search - contains
		System.out.println(h.contains(2));
		// delete
		  System.out.println(h.remove(2));
		  System.out.println(h);
		  //size
		System.out.println("size of set is: " +h.size());
		
		
		
		

	}

}
