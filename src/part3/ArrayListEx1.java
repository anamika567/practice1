package part3;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Object> ob=new ArrayList<Object>();
ob.add(100);
ob.add("btm");
ob.add('A');
ob.add(true);
ob.add(12.5f);
for(Object i:ob)
{
	System.out.println(i);
}
	}

}
