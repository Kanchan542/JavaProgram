class RangeOfHappyNumber
{
	public static void main(String args[])
	{
		int start=1;
		int end=1000;
		while(start<=end)
		{
			if(isHappy(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}
	public static int SumDigit(int n)
	{
		int sqr=0;
		while(n!=0)
		{
			int last=n%10;
			sqr+=(last*last);
			
			n/=10;
		}
		return sqr;
	}
	public static boolean isHappy(int n)
	{
		while(true)
		{
			n=SumDigit(n);
			if(n==4 || n==1)
			{
				break;
			}
			
		}
		return n==1;
	}
	
}