class  EmirpNumber
{
	public static void main(String args[])
	{
		int n=13;
		if(isPrime(n))
		{
			//System.out.println(n);
			n=reverse(n);
			//System.out.println(n);
			if(isPrime(n))
			{
				System.out.println("Number is emirp");
			}
			else
			{
				System.out.println("Not emirp number");
			}
		}
		else
		{
			System.out.println("Not prime number");
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