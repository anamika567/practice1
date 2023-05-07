package part3;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> h=new HashSet<String>();
h.add("SQL");
h.add("JAVA");
h.add("MANUAL");
h.add("SQL");
h.add("JAVASCRPT");
h.add("WEB");
h.add("WEB");
h.add(null);
for(String s:h)
{
	System.out.println(s);
}
}

}
