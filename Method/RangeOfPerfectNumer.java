class RangeOfPerfectNumer
{
	public static void main(String args[])
	{
		int start=1,end=100;
		while(start<=end)
		{
			if(isPerfect(start))
			{
				System.out.println(start);
			}
		}
	}
	public static int sumFactors(int n)
	{
		int sum=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	public  static boolean isPerfect(int n)
	{
		return n==sumFactors(n);
	}
}