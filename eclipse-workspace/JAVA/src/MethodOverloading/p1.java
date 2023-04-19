package MethodOverloading;

public class p1 {
  public static void m1()
  {
	  System.out.println("with 0 arguments");
  }
  public static void m1(int a)
  {
	  System.out.println("with 1 arguments");
  }
  public static void m1(String s)
  {
	  System.out.println("with string name");
  }
  public static void m2()
  {
	  System.out.println("kbj");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p1.m1();
		p1.m1(12);
		p1.m1("Balram");
	    p1.m2();

	}

}
