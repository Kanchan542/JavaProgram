class HailStone
{
	public static void main(String args[])
	{
		int n=9;
		System.out.println("No of steps: "+isHailStone(n));
	}
	public static int isHailStone(int n)
	{
		int ct=0;
		while(n!=1)
		{
			System.out.println(n);
			if(n%2==0)
			{
				n/=2;
			}
			else
			{
				n=3*n+1;
			}
			ct++;
		}
		return ct;
	}
}