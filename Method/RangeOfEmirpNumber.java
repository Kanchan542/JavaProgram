class RangeOfEmirpNumber
{
	public static void main(String args[])
	{
		int start=1;
		int end=1000;
		while(start<=end)
		{
			if(isPrime(start))
			{
				int rev=reverse(start);
				if(isPrime(rev))
				{
					System.out.println(start);
				}
			}
			start++;
		}
	}
	public static int reverse(int n)
	{
		int rev=0;
		for(int i=n;i!=0;i/=10)
		{
			int last=i%10;
			rev=rev*10+last;
		}
		return rev;
		
	}
	public static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
			
		}
		return true;
	}
}