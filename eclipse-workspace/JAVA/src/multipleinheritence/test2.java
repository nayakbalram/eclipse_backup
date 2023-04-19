package multipleinheritence;

public class test2 implements test0,test1 {

	public static void main(String[] args) {
		test2 t=new test2();
		t.m1();
		t.m2();
		t.m3();
		System.out.println(t.a);
		System.out.println(t.b);
		
   

}

	public void m1() {
		System.out.println("From m1");
		
	}

	public void m2() {
		System.out.println("From m2");
		
	}

	public void m3() {
    System.out.println("From m3");		
	}
}
