class PrimeNumber
{
	public static void main(String args[])
	{
		primeNumber1(13);
	}
	public static void primeNumber1(int n)
	{ 
		int den=2;
		for(int i=0;i<=n;i++)
		{
			
			if(n%den==0){
				break;
				
			}
			den++;
		}
		if(n==den){
			System.out.println("prime");
		}
		else {
			System.out.println("Not prime");
		}
	}
}