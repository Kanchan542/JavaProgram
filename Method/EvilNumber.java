class EvilNumber
{
	public static void main(String args[])
	{
		int n=15;
		if(isEvilNumber(n))
		{
			System.out.println("Number  is evil");
		}
		else
		{
			System.out.println("Number is not evil");
		}
	}
	public static boolean isEvilNumber(int n)
	{
		while(n!=1)
		{
			int last=n%2;
			if(last!=1)
			{
				return false;
			}
			n/=2;
			
		}
		return true;
	}
}