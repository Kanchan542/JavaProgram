class RangeOfFascilatingNumber
{
	public static void main(String args[])
	{
		int start=1,end=1000;
		while(start<=end)
		{
			if(isFacilating(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}
	public static boolean isFacilating(int n)
	{
		int ans=0,ans1=0,last1=0,last2=0;
		if(count(n)>=3)
		{
			last1=n*2;
			ans=n*power(10,count(last1))+last1;
			last2=n*3;
			ans=ans*power(10,count(last2))+last2;
		}
		return unique(ans);
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
	public static boolean unique(int n)
	{
		
		while(n!=0)
		{
			int temp=n;
			int last=n%10;
			
			if(last==0)
			{
				return false;
			}
			temp/=10;
			while(temp!=0)
			{
				if(last!=temp%10)
				{
					temp/=10;
				}
				else
				{
					break;
				}
			}
			if(temp!=0)
			{
				break;
			}
			n/=10;
		}
		return n==0;
	}
	public static int power(int rem,int ct)
	{
		int pow=1;
		for(int i=1;i<=ct;i++)
		{
			pow*=rem;
		}
		return pow;
	}
}