package part3;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {11,10,23,56,45};
		
		System.out.println("Hello");
		try {
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bound");
		}
		System.out.println("Done");
		System.out.println("main ends");

	}

}
