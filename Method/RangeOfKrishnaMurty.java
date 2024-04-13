class RangeOfKrishnaMurty
{
	public static void main(String args[])
	{
		int start=1;
		int end=1000;
		while(start<=end)
		{
			if(isKrishnaMurty(start))
			{
				System.out.println(start);
			}
			start++;
		}
		
	}
	public static boolean isKrishnaMurty(int n)
	{
		return n==factorial(n);
	}
	public static int factorial(int n)
	{
		int sum=0;
		for(int i=n;i!=0;i/=10)
		{
			int last=i%10;
			int fact=1;
			for(int j=1;j<=last;j++)
			{
				fact*=j;
			}
			sum+=fact;
		}
		return sum;
	}
}