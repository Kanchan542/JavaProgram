class RangeOfSphenicNumber
{
	public static void main(String args[])
	{
		int start=1,end=200;
		while(start<=end)
		{
			if(isSphenic(start)==start)
			{
				System.out.println(start);
			}
			start++;
		}
	}
	public static boolean isPrime(int n)
	{
		for(int i=2;i!=0;i/=10)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static int isSphenic(int n)
	{
		int den=2,count=0,mul=1;
		while(den<n)
		{
			if(n%den==0 && isPrime(den))
			{
				mul*=den;
				count++;
				if(count==3)
				{
					break;
				}
			}
			den++;
			
			
		}
		return mul;
	}
}