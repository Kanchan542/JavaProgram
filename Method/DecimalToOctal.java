class DecimalToOctal
{
	public static void main(String args[])
	{
		int n=10;
		System.out.println(decimalToOcatal(n));
	}
	public static int decimalToOcatal(int n)
	{
		/*String ans=" ";
		
		while(n!=0)
		{
			int rem=n%8;
			ans=rem+ans;
			n/=8;
			
		}
		return ans;
		*/
		int ans=0;
		int power=1;
		while(n>0)
		{
			int last=n%8;
			ans+=last*power;
			n/=8;
			power*=10;
		}
		return ans;
	}
	
}