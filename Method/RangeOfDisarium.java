class RangeOfDisarium
{
	public static void main(String args[])
	{
		int start=1;
		int end=1000;
		while(start<=end)
		{
			if(isDisarium(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}
	public static boolean isDisarium(int n)
	{
		int ct=count(n);
		int sum=0;
		for(int i=n;i!=0;i/=10)
		{
			int rem=i%10;
			sum+=power(rem,ct);
			ct--;
		}
		return sum==n;
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
	public static int power(int rem,int ct)
	{
		int pow=1;
		for(int i=ct;i>0;i--)
		{
			pow=pow*rem;
		}
		return pow;
	}
}