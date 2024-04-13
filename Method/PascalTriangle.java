class PascalTriangle
{
	public static void main(String args[])
	{
		pascal(7);
	}
	public static int formula(int n,int r)
	{
		return factorial(n)/factorial(n-r)*factorial(r);
	}
	public static int factorial(int n)
	{
		int fact=1;
		while(n>0)
		{
			fact*=n;
			n--;
		}
		return fact;
			
	}
	public static void pasca(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" "+" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(formula((i,j)+" ");
			}
		}
		System.out.println();
	}
}