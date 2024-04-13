class HappyNumber{

	public static void main(String args[])
	{
		int n=12;
		if(isHappy=1)
		{
			System.out.println("Number is happy");
		}
		else
		{
			System.out.println("Number is not happy");
		}
	}
	public static int sumDigit(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum+=(rem*rem);
			num/=10;
		}
		return sum;
	}
	public static boolean isHappy(int n)
	{
		while(true)
		{
			n=sumDigit(n);
			if(n==1 || n==4)
			{
				break;
			}
			
		}
		return n==1;
	}
}