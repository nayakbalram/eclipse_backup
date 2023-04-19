package Abstraction;

public class test3 extends test1 {

	public static void main(String[] args) {
		test3 t=new test3();
		t.m1();
		t.m2();
		t.m3();

	}

	@Override
	void m2() {
       System.out.println("from m2");		
	}

}
