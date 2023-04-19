package Constructor;

public class test3 {
      test3()
      {
    	  System.out.println("Constructor-1");
      }
      test3(int a)
      {
    	  System.out.println("Constructor-2");
      }
      test3(String name)
      {
    	  System.out.println("i am string ");
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test3 t=new test3();
		test3 t1=new test3(10);
		// When there is more than 1 constructor is there then we can call Constructor overloading
		
      test3 t2=new test3("Balram");
	}

}
