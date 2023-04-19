package Encapsulation;
class IdentityCard
{
	private String name;
	private int Rollno;
	private String address;
	public void setName(String name, int Rollno, String address )
	{
		this.name=name;
		this.Rollno=Rollno;
		this.address=address;
	}
	public String get()
	{
		return(name);
	}
	public int getroll()
	{
		return(Rollno);
	}
	public String getAddress()
	{
		return(address);
	}
}

public class test2 {

	public static void main(String[] args) {
    IdentityCard c=new IdentityCard();
    c.setName("Balram", 100, "Konisi");
    System.out.println(c.get());
    System.out.println(c.getroll());
    System.out.println(c.getAddress());
	}

}
