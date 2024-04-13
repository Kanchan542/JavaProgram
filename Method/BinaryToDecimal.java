class BinaryToDecimal
{
	public static void main(String args[])
	{
		int n=1010;
		System.out.println(BinaryToDes(n));
	}
	public static int BinaryToDes(int n)
	{
		int sum=0;
		int i=0;
        while(n!=0)
		{
			int rem=n%10;
			sum=sum+(rem*power(2,i));
			i++;
			n/=10;
			
		}
		return sum;
	}
	public static int power(int rem,int n)
	{
		int pow=1;
		for(int i=1;i<=n;i++)
		{
			pow*=rem;
		}
		return pow;
	}
}