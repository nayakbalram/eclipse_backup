package hieraricalinheritence;

public class kasis extends Dagal{
  void m3()
  {
	  System.out.println(" i am younger daughter of dagal");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kasis k=new kasis();
		k.m1();
		k.m3();
		System.out.println("______________________________________");
		sruti s=new sruti();
		s.m1();
		s.m2();

	}

}
