class SunnyNumber
{
	public static void main(String args[])
	{
		int n1=80,n=1;
		if(isSunny(n,n1))
		{
			System.out.println("Sunny number");
		}
		else 
		{
			System.out.println("Not sunny number");
		}
		
	}
	public static boolean isSunny(int n,int n1)
	{
		System.out.println(n+" "+n1);
		boolean falg=false;
		while(n1>0)
		{
			if(n1!=(n*n)-1)
			{
				falg = false;
			}
			else if(n1==(n*n)-1)
			{
				falg=true;
			}
			else
			{
				n++;
			}
		}
		System.out.println(n+" "+n1);
		return falg;
	}
	
}