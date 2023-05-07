package part3;

import java.util.ArrayList;
import java.util.ListIterator;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Float> al=new ArrayList<Float>();
        al.add(12.23f);
        al.add(15.45f);
        al.add(13.00f);
        al.add(10.03f);
        al.add(17.20f);
      
       ListIterator i=al.listIterator();
	      //System.out.println("Printing element in forward direction:");
        while(i.hasNext());
        {
        	System.out.println(i.next());
        }
        
        		//System.out.println("Printing element in backward direction:");
		while(i.hasPrevious())
		{
			
			System.out.println(i.previous());
		}
       /*
		for(Float x:al)
        {
        	System.out.println(x);
        }
       */ 
        
	}

}
