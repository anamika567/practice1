package part3;

import java.util.*;


public class TS {

	public TS() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Object> t=new TreeSet<Object>();
		t.add(123);
		t.add(456);
		t.add(896);
		
		System.out.println(t);
		System.out.println("printing using iterator");
		Iterator<Object> i=t.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("printing in descending order:" +t.descendingSet());
		TreeSet<String> t2=new TreeSet<String>();
		t2.add("btm");
		t2.add("qspider");
		t2.add("jspider");
		t2.add("qspider");
		t2.add("java");
		System.out.println("printing using loop");
		for(String s:t2)
		{
			System.out.println(s);
		}
		

	}

}
