package part3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,Object> t=new TreeMap();
t.put(1,"jkl");
t.put(6, "nmb");
t.put(3, "asd");
t.put(4, null);
System.out.println(t.entrySet());

Set<Object> s=(Set)t.entrySet();
Iterator<Object> i=s.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}




	}

}
