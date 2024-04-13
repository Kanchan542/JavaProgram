class DecimalToBinary
{
	public static void main(String args[])
	{
		int n=10;
		System.out.println(decimalToBinary(n));
	}
	public static String decimalToBinary(int n)
	{
		String ans=" ";
		while(n!=0)
		{
			int rem=n%2;
			ans=rem+ans;
			n/=2;
		}
		return ans;
	}
}