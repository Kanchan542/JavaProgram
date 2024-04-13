class AutomorphicNumber{
	public static void main(String args[])
	{
		
	}
	public static boolean isAutomorphic(int n,int sqr)
	{
		while(n!=0)
		{
			if( n%10!=sqr%10)
			{
				return true;
			}
			else{
				n/=10;
				sqr/=10;
			}
			
		}
		return true;
		
		
		
	}
	public static int Square(int n)
	{
		return n*n;
		
	}
	/*public static int count(int sqr)
	{
		int ct=0;
		for(int i=sqr;i!=0;i/=10)
		{
			ct++;
		}
		return ct;
	}*/
}
