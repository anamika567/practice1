//WJP TO IMPLEMENT EXCEPTION HANDLING ,HANDLE USING TRY CATCH StringIndexOutOfBoundsException.


package part3;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		char c='a';
		try
		{
			c=s.charAt(4);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally {
		System.out.println(s.toUpperCase());
		System.out.println(s.concat("language"));
		}

	}

}
