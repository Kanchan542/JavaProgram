class XylemNumber
{
	public static void main(String args[])
	{
		int n=1353,sum1=0, sum2=0;
		if(count(n)>=4)
		{
			int last=n%10;
			n/=10;
			while(n!=1)
			{
				int last1=n%10;
				sum2+=last1;
				n/=10;
			}
			sum1+=last+n;			
		}
		//System.out.println(sum1+" "+sum2);
		if(sum1==sum2)
		{
			System.out.println("Xylem number");
		}
		else{
			System.out.println("Not xylem number");
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