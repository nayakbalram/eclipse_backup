package Abstraction;

public class test2 extends test1 {

	public static void main(String[] args) {
        test2 t=new test2();
           t.m1();
           t.m2();
           t.m3();
           t.m4();
	}

	@Override
	void m2() {
		System.out.println("from m2");
		
	}
	void m4()
	{
		System.out.println("from m4");
	}

	@Override
	void m1() {
    System.out.println("From m1");		
	}

}
