package Array;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= new int [2][3];
		a[0][0]=1; a[0][1]=3; a[0][2]=4;
		a[1][0]=3; a[1][1]=9; a[1][2]=6;
		
		//System.out.println(a[1][1]);
		for(int i=0; i<2;i++)
		{
			for (int j=0; j<3;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("\t");
		}
	}

}
