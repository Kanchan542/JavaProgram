class RangeOfReunitNumber
{
	public static void main(String args[])
	{
		int start=1,end=500;
		while(start<=end)
		{
			if(isReunit(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}
	public static boolean isReunit(int n)
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