package MethodOverride;

public class Subclass extends Superclass {
   void m1()
   {
	   System.out.println("From child class");
   }
	public static void main(String[] args) {
     
      Subclass s1=new Subclass();
      s1.m1();
      // The process of overriding means the implementation of superclass to that implementation of subclass during object creation of subclass
      // We need at least two class with same method name & formal argument 
    
	}

}
