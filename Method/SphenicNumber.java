class SphenicNumber
{
	public static void main(String args[])
	{
		int n=30;
		if(primeFactor(n)==n)
		{
			System.out.println("Spenic number");
		}
		else
		{
			System.out.println("Not sphenic number");
		}
	}
	public static int primeFactor(int n)
	{
		int den=2,count=0,mul=1;
		while(den<n)
		{
			if(n%den==0 && isPrime(den))	
			{
					mul*=den;
					System.out.println(den);
					count++;
			
				if(count==3){
					break;
				}
				//System.out.println(mul); 
			}
			den++;
			
			
		}
		return mul;
	}
	
	public static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}