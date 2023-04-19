package Inheritence;

public class b3 extends b2 implements b1 {

	public static void main(String[] args) {
		b3 b=new b3();
		b.m1();
		b.m2();
     
	}

	public void m1() {
      System.out.println("from m1");		
	}

}
