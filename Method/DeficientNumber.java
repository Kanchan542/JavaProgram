class DeficientNumber{
	public static void main(String args[])
	{
		int n=8;
		if(n>factors(n))
		{
			System.out.println("Number is deficient");
		}
		else
		{
			System.out.println("Number is not deficient");
		}
	}
	public static int factors(int n)
	{
		int fact=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				fact+=i;
			}
		}
		System.out.println(fact);
		return fact;
	}
}