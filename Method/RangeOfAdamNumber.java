class RangeOfAdamNumber
{
	public static void main(String args[])
	{
		int start=1,end=1000;
		while(start<=end)
		{
			if(isAdam(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}
	public static boolean isAdam(int n)
	{
		int sqr=n*n;
		int n2=reverse(n);
		int sqr2=n2*n2;
		return sqr==reverse(sqr2);
		
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