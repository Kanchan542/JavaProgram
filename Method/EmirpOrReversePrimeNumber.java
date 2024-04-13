class EmirpOrReversePrimeNumber{
	public static void main(String args[])
	{
		int n=22;
		if(isEmirp(n))
		{
			System.out.println("Is Emirp/Reverse prime/Twisting Prime Number");
		}
		else
		{
			System.out.println("Not Emirp/Reverse prime/Twisting Prime Number");
		}
		
	}
	public static boolean isEmirp(int n)
	{
		int rev=reverse(n);
		return isPrime(n)&&isPrime(rev);
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
	public static int reverse(int n)
	{
		int rev=0;
		for(int i=n;i!=0;i/=10)
		{
			rev=rev*10+(i%10);
		}
		return rev;
	}
	
}