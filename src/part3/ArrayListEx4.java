package part3;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Object> ob=new ArrayList<Object>();
		ob.add(100);
		ob.add(10);
		ob.add(78);
		ob.add(89);
		ob.add(78);
		ob.add("btm");
		ob.add("india");
		ListIterator<Object> l=ob.listIterator();
		while(l.hasNext())
		{
			Object a=l.next();
			if(a.equals(78))
				{
				l.remove();
				}
				}
		System.out.println("after removing 78 from list");
		for(Object k:ob)
		{
			System.out.println(k);
			
		}
		
	
		
	}

}
