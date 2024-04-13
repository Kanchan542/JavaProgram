class RangeOfEvilNumber
{
	public static void main(String args[])
	{
		int start=1,end=2000;
		while(start<=end)
		{
			if(isEvil(start))
			{
				System.out.println(start);
			}
			start++;
		}
		
	}
	public static boolean isEvil(int n)
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