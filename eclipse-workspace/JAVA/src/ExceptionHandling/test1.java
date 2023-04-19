package ExceptionHandling;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=0;
		
		try
		{
			int k=b/c;
			System.out.println(k);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}

	}

}
