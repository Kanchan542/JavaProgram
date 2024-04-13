class PerfectNumber
{
	public static void main(String args[])
	{
		int n=28;
		if(isPerfect(n))
		{
			System.out.println("Number is perfect");
		}
		else
		{
			System.out.println("Number is not perfect");
		}
		
	}
	public static boolean isPerfect(int n)
	{
		return n==sumFactor(n);
	}
	public static int sumFactor(int n)
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
}