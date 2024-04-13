class DisariumNumber
{
	public static void main(String args[])
	{
		System.out.println(isDisarium(135));
	}
	public static boolean isDisarium(int n)
	{
		int ct=count(n);
		int sum=0;
		for(int i=n;i!=0;i/=10)
		{
			int rem=i%10;
			sum=sum+power(rem,ct);
			ct--;
		}
		
		return n==sum;
	}
	public static int count(int n)
	{
		int ct=0;
		while(n!=0)
		{
			ct++;
			n/=10;
		}
		return ct;
	}
	public static int power(int rem, int count)
	{
		int pow=1;
		
		for(int i=count  ;i>0;i--)
		{
			pow*=rem;
		}
		return pow;
	}
}