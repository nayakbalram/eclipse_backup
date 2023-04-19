package Collection;

import java.util.Stack;

public class test2 {

	public static void main(String[] args) {
		  Stack<String> a=new Stack<String>();
		  a.push("Ashish");
		  a.push("Shruthi");
		  a.push("Kartik");
		  System.out.println(a);
		  a.pop();// LIFO
		  System.out.println(a);
		  System.out.println(a.push("Aryan"));
		  System.out.println(a);
		  

	}

}
