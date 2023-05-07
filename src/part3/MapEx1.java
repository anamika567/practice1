package part3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap<String,Object> h=new HashMap<String,Object>();
  h.put("Name","Kiya");
  h.put("age",25);
  h.put("place","Delhi");
  h.put("phno",7496854572l);
  //h.put("Name1", "Kiya");
  System.out.println(h.entrySet());
  System.out.println(h.values());
  System.out.println(h.keySet());

  System.out.println(h.remove("place"));
  System.out.println(h.containsKey("age"));
  
  // change into set
  Set<Object> s=(Set)h.entrySet();
  
  Iterator<Object> i=s.iterator();
  while(i.hasNext())
  {
	  System.out.println(i.next());
  }
  
  
  
  
	}

}
