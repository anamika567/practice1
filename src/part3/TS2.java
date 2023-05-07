package part3;

import java.util.TreeSet;

public class TS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> t3=new TreeSet<Student>();
		t3.add(new Student(123,"biya"));
		t3.add(new Student(223,"iya"));
		t3.add(new Student(23,"siya"));
		t3.add(new Student(11,"ziya"));
		t3.add(new Student("priya"));
		System.out.println(t3);
		boolean b=t3.contains(new Student(123,"iya"));
		System.out.println(b);
		

	}

}
