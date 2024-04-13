class LycharelNumber
{
	public static void main(String args[])
	{
		int n=295;
		if(isLycharel(n))
		{
			System.out.println("Lycharel Number");
		}
		else
		{
			System.out.println("Not Lycharel Number");
		}
	}
	public static boolean isLycharel(int n)
	{
		int sum=n+reverse(n);
		return !isPalindrome(sum);
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
	public static boolean isPalindrome(int n)
	{
		return n==reverse(n);
	}
}