class ReunitNumber
{
	public static void main(String args[])
	{
		int n=31;
		if(reunitNumber(n))
		{
			System.out.println("Number is reunit number");
		}
		else
		{
			System.out.println("Not reunit number");
		}
	}
	public static boolean reunitNumber(int n)
	{
		int count=0;
		while(n!=0)
		{
			int last=n%5;
			if(last==1)
			{
				count++;
				if(count==3)
				{
					return true;
				}
			}
			n/=5;
		}
		
		return false;
	}
	
}