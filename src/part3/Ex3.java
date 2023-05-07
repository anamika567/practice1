package part3;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		try {
			div();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("another method");
		add();
	}
	public static void div()
	{
		//int b=50/0;
		System.out.println(2010);
        System.out.println("hi");
	}
	public static void add()
	{
		System.out.println(200+50);
	}

}
