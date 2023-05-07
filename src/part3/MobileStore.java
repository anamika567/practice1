package part3;

import java.util.*;


public class MobileStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Object> h=new HashMap<Integer,Object>();
		h.put(1, new Mobile("vivo",2500));
		h.put(2,new Mobile("oppo",3200));
		h.put(3,new Mobile("nokia",3240));
		h.put(4,new Mobile("samsung",4000));
		h.put(5,new Mobile("oneplus",3600));
		 System.out.println(h.values());
		System.out.println(h.keySet());
		System.out.println(h.entrySet());
		h.remove(4);
		System.out.println(h.entrySet());
		//converting HashMap into TreeMap
		TreeMap<Integer,Object> t = new TreeMap<Integer,Object>(h);
		System.out.println("Assending order" + t);
		System.out.println("descending order" +t.descendingMap() );
		t.remove(1);
		System.out.println("after removing one entry"+ t.entrySet());
		

	}

}
