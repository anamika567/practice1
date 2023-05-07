package part3;

import java.util.HashSet;
import java.util.Iterator;

public class HashEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> ob=new HashSet<Object>();
		ob.add(new Student(123,"neha"));
		ob.add(new Student(153,"akku"));
		ob.add(new Student(183,"anu"));
		ob.add(new Student(143,"anam"));
		System.out.println("printing "+ob);
		Iterator<Object> l=ob.iterator();
		while(l.hasNext())
		{
			Object o=l.next();
			if(o.equals("btm"))
			{
				l.remove();
				
			}
			//System.out.println(l.next());
		}
		System.out.println("printing using loop:");
		for(Object k:ob)
		{
			System.out.println(k);
		}
	}

}
