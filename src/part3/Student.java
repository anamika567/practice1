package part3;

public class Student implements Comparable<Student> {
	int id;
	String name;
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	} 
	/*
	public Student (int id) {
		this.id=id;
	}
	*/
	public Student(String name) {
		this.name=name;
		
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	/*
	public int compareTo(Student s)
	{
		if(this.id>s.id)
		   return 1;
		else if(this.id==s.id)
			return 0;
		else
			return -1;
		
	}
	*/
	public int compareTo(Student s)
	{
		if(this.name.compareTo(s.name)>1)
		   return 1;
		else if(this.name.compareTo(s.name)==0)
			return 0;
		else
			return -1;
		
	}
	
}
