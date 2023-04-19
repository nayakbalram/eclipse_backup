package Superkeyword;

public class Child extends Parent {
	int a=20;
	String name="Rahul";
	public void m2()
	{
		System.out.println(super.a);//10
		System.out.println(super.name);//Kriti
		System.out.println(a);        //20
		System.out.println(name); //Rahul
	    super.m1();
	}
	Child()
	{
		super();
		System.out.println("I am child class constructor");
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.m2();
		

	}

}
