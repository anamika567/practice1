package part3;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> ob=new ArrayList<Object>();
		System.out.println(ob.isEmpty());
		
		ob.add(100);
		ob.add("btm");
		//System.out.println(ob.contains("abcd"));
		ob.add('A');
		ob.add(true);
		ob.add(12.5f);
		
		ArrayList<Object> ob1=new ArrayList<Object>();
		ob1.add(10);
		ob1.add("btmabc");
		ob1.add('B');
		ob1.add(true);
		ob1.add(16.5f);
		ob.addAll(ob1);
		//ob.removeAll(ob1);
		for(Object i:ob)
		{
			System.out.println(i);
		}
			}

	

}
