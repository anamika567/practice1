
// Create a hashset add hetrogeneous data apply remove,addAll methods 
//and print using for each loop.

package part3;

import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> h=new HashSet<Object>();
		h.add(120);
		h.add("ritu");
		h.add(563);
		h.add(12.02f);
		h.add("jyoti");
		h.remove(563);
		HashSet<Object> h1=new HashSet<Object>();
		h1.add(158);
		h1.add("sona");
		h1.add(893);
		h1.add(13.2f);
		h1.add("neha");
		h.addAll(h1);
		for(Object i:h)
		{
			System.out.println(i);
		}

	}

}
