package part3;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the second number:");
		int b=sc.nextInt();
		System.out.println("Division");
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
System.out.println("Done");
System.out.println("Main ends");
	}

}
