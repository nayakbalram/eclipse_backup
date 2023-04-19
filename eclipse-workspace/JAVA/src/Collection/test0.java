package Collection;

import java.util.ArrayList;

public class test0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("Balram");
		a.add("Kumar");
		a.add("Nayak");
		System.out.println(a);
		a.add(0, "Arun");
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.remove(2));
		System.out.println(a);
		a.add(2,"Rohit");
		System.out.println(a);
		System.out.println(a.contains("Balram"));// give boolean
		System.out.println(a.indexOf("Nayak"));// at what index it will display
		System.out.println(a.set(0, "Balram"));// it will replace Arun name to Balram
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		a.remove(0);
		System.out.println(a);
		a.clear(); // All clear 
		
		System.out.println(a);
		

	}

}
