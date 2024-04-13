class RangeOfDeficientNumber
{
	public static void main(String args[])
	{
		int start=1;
		int end=1000;
		while(start<=end)
		{
			if(start>factors(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}
	public static int factors(int n)
	{
		int fact=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				fact+=i;
			}
		}
		return fact;
	}
	
}