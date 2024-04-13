class GoodNumber
{
	public static void main(String args[])
	{
		int n=31;
		if(isGood(n))
		{
			System.out.println("Number is good");
			
		}
		else{
			System.out.println("Number is not good");
		}
	}
	public static boolean isGood(int n)
	{
		for(int i=n;i!=0;i/=10)
		{
			int last=i%10;
			//System.out.println(n);
			if(n%last!=0)
			{
				return false;
				
			}
			
		}
		return true;
	}
}