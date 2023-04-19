package Abstraction;

public  class p2 extends p1{
	void m1()
	{
		System.out.println("from class p2 ");
	}
	p2()
	{
		System.out.println("i am constructor from p2");
	}

	public static void main(String[] args) {
      p2 p=new p2();
      p.m1();
      // For constructor only object creation is enough to call method
	}

}
