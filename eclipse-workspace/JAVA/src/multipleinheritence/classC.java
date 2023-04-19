package multipleinheritence;

public class classC implements classA,classB{

	public static void main(String[] args) {
		classC c=new classC();
		System.out.println(c.a);
		System.out.println(c.b);

	}

}
