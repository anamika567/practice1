package part3;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> a=new ArrayList<Object>();
		a.add(10);
		a.add(12);
		a.add(55);
		a.add("java");
		a.add("sql");
		a.add("india");
		
		System.out.println(a.get(2)); 
		System.out.println(a.indexOf("sql"));
		//a.remove(1);
		a.add(3,"abc");
		System.out.println(a.contains("btm"));
		for(Object i:a)
		{
			System.out.println(i);
		}
	    		
	}

	}

