package Encapsulation;
class Navyug
{
	private int empId;
	public void setId(int a)
	{
		this.empId=a;
	}
	public int getId()
	{
		return(empId);
			
	}
}

public class test1 {

	public static void main(String[] args) {
		Navyug n=new Navyug();
		n.setId(198);
		System.out.println(n.getId());

	}

}
