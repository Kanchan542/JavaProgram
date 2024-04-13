class RangeOfSmithNumber{
	public static void main(String args[])
	{
		int start=1,end=1000;
		while(start<=end)
		{
			if(isSmith(start))
			{
				System.out.println(start);
			}
			start++;
		}
		
	}
	public static boolean isSmith(int n)
	{
		return sumNum(n)==primeFactor(n);
	}
	public static int sumNum(int n)
	{
		int sum=0;;
		for(int i=n;i!=0;i/=10)
		{
			sum+=i%10;
		}
		return sum;
	}
	public static int primeFactor(int n)
	{
		int sum=0,den=2;
		while(n!=1)
		{
			if(n%den==0)
			{
				n/=den;
				if(isPrime(den))
				{
					sum+=sumNum(den);
				}
				den=2;
			}
			else
			{
				den++;
			}
		}
		return sum;
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