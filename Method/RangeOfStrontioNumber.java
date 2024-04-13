class RangeOfStrontioNumber
{
	public static void main(String args[])
	{
		int start=1000,end=2000;
		while(start<=end)
		{
			if(isStrontio(start))
			{
				System.out.println("start"+start);
			}
			start++;
		}
	}
	public static boolean isStrontio(int n)
	{
		int last1=0,last2=0;
		if(count(n)>=4)
		{
			//n=n*2;
			int temp=n*2;
			System.out.println(n+" "+temp);
			//n/=10;
			
			temp/=10;
			temp/=10;
			last1=n%10;
			temp/=10;
			last2=n%10;
			
		}
		return last1==last2;
			
	}
	public static int count(int n)
	{
		int ct=0;
		for(int i=n;i!=0;i/=10)
		{
			ct++;
		}
		return ct;
	}
}