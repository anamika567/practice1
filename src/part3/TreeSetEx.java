package part3;

import java.util.*;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(563);
		t.add(852);
		t.add(741);
		t.add(123);
		t.add(159);
		
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(514);
		t1.add(852);
		t1.add(701);
		t1.add(103);
		t1.add(139);
		
		t.addAll(t1);
		t.remove(123);
		
		for(Integer i:t)
		{
			System.out.println(i);
		}

	}

}
