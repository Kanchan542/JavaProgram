class StrontioNumber
{
	public static void main(String args[])
	{
		int n=1386;
		if(count(n)>=4)
		{
			n=n*2;
			n/=10;
			int last1=n%10;
			n/=10;
			int last2=n%10;
			if(last1==last2)
			{
				System.out.println("Number is Strontio");
			}
			else
			{
				System.out.println("Number is not Strontio");
			}
				
				
		}
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