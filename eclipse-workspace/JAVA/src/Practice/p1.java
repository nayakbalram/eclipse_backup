package Practice;

public class p1 {
   private String name;
   private int rollno;
   private String address;
   public void setname(String name, int rollno, String address)
   {
	   this.name=name;
	   this.rollno=rollno;
	   this.address=address;
   }
	   public String getname()
	   {
		   return name;
	   }
	   public String getaddress()
	   {
		   return address;
	   }
	   public int getrollno()
	   {
		   return rollno;
	   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p1 p=new p1();
		p.setname("Balram", 12, "konisi");
      System.out.println(p.getname());
      System.out.println(p.getaddress());
      System.out.println(p.getrollno());

	}

}
