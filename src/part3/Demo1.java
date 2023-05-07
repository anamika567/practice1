package part3;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(12);
		a.add(55);
		a.add(50);
		
		ListIterator i=a.listIterator();
		/*
		 while(i.hasNext())
		 
		{
			Integer al=(Integer) i.next();
			if(al==12)
			{
				i.remove();
			}
		}
       for(Integer x:a)
       {
    	   System.out.println(x);
       }
       */
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
		}
		

	}

