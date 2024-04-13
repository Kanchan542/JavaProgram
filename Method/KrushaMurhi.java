class KrushaMurhi
{
	public static void main(String args[])
	{
		int n=145;
		int res=factorial(n);
		if(n==res)
		{
			System.out.println("Number is KrushaMurthi Number");
		}
		else
		{
			System.out.println("Number is not KrushaMurthi");
		}
	}
	public static int factorial(int n)
	{
		int sum=0;
		
		for(int i=n;i!=0;i/=10)
		{
			int last=i%10;
			int fact=1;
			for(int j=1;j<=last;j++)
			{
				fact=fact*j;
				
			}
			//System.out.println(fact);
			sum+=fact;
			
		}
		
		return sum;
	}
}