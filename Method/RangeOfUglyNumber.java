class RangeOfUglyNumber
{
	public static void main(String args[])
	{
		int start=1;
		int end=1000;
		while(start<=end)
		{
			if(isUgly(start))
			{
				System.out.println(start);
			}
			start++;
		}
		
	}
	public static boolean isUgly(int n)
	{
		boolean inc=false,desc=false;
		int last=n%10;
		while(n>9)
		{
			n/=10;
			int secLast=n%10;
			if(last>secLast)
			{
				desc=true;
			}
			else if(last<secLast)
			{
				inc=true;
			}
			if(inc&&desc)
			{
				return true;
			}
			else{
				last=secLast;
			}

		}
		return inc&&desc;
		
	}
}