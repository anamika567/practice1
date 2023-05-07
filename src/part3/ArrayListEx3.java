package part3;

import java.util.*;

public class ArrayListEx3 {

	public static void main(String[] args) {
	
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(8);
		a.add(2);
		a.add(17);
		a.add(21);
		a.add(80);
		a.add(null);
		a.add(null);
		/*Iterator i =a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		*/
		ListIterator<Integer>l=a.listIterator();
		System.out.println("Printing element in forward direction:");
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		System.out.println("Printing element in backward direction:");
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
		
	}

}
