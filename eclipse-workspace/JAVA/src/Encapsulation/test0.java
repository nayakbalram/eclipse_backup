package Encapsulation;
class Employee
{
	protected String name;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}

public class test0 {

	

	public static void main(String[] args) {
		Employee e=new Employee();
	   e.setName("Jagannath ji");
		System.out.println(e.getName());
		
	}

}
