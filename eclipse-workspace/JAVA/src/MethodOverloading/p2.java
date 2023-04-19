package MethodOverloading;

public class p2 {
 static int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		System.out.println(a);// Here, local variable will be more prior level than global
		System.out.println(p2.a);

	}

}
