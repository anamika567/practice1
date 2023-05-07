package part3;
import java.util.*;

public class HashSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> h=new HashSet<Object>();
		h.add(150);
		h.add("btm");
		h.add(100);
		h.add(160);
		h.add(161);
		h.add(0);
		
		HashSet<Object> h1=new HashSet<Object>();
		
		h1.add(102);
		h1.add("jkl");
		h1.add(120);
		h1.add(200);
		h1.add(101);
	
		h.remove(100);
		System.out.println(h.contains(140));
		h.addAll(h1);
		for(Object s:h)
		{
			System.out.println(s);
		}
		

	}

}
