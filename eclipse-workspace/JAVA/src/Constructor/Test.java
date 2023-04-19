package Constructor;

public class Test {
	Test()
	{   
		this(4);
		System.out.println("jhgjh");
	}
	Test(int a)
	{
		this(4,6);
		System.out.println("rger");
	}
	Test(int a, int b)
	{
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Constructor Programme Start");
		Test a=new Test();
		System.out.println("Constructor Programme Finished");
    
	}//Constructor Chaining

}
