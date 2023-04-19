package Collection;

import java.util.LinkedList;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>a=new LinkedList<String>();
		a.add("Balram");
		a.addFirst("Raj");
		a.addLast("Anand");
		System.out.println(a);
		a.removeLast();
		System.out.println(a);

	}

}