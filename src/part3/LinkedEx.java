package part3;

import java.util.*;

public class LinkedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 LinkedList<Object> l=new LinkedList<Object>();
 l.add("sql");
 l.add("java");
 l.add("web");
 l.add("javascript");
 l.add(1230);
 l.add('a');
 l.add(null);
 l.add(null);
 
 for(Object i:l)
 {
	 System.out.println(i);
	 
 }
 l.add(2, "selenium");
 System.out.println("after adding one more element:");
 
 for(Object s:l) 
 {
	System.out.println(s); 
 }
 System.out.println(l.indexOf("web"));
	}

}
