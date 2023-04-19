package Thiskeyword;

public class test0 {
	int a=10;
	String name="Balram";
   
  void m1()
 {
	 System.out.println(this.a);
	 System.out.println(this.name);
	 System.out.println(" I am this call ");
 }
	public static void main(String[] args) {
	
	test0 t=new test0();
	t.m1();
	
	
		
		
	
	  

	}

}
