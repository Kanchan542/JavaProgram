class SmithNumber{
	public static void main(String args[])
	{
		int n=85;
		if(isSmith(n))
		{
			System.out.println("Number is smith number");
		}
		else
		{
			System.out.println("Number is not smith number ");
		}
	}
	public static boolean isSmith(int n)
	{
		return sumNum(n)==primeFactor(n);
	}
	public static int sumNum(int n)
	{
		int sum=0;
		for(int i=n;i!=0;i/=10)
		{
			int last=i%10;
			sum+=last;
		}
		return sum;
	}
	public static int primeFactor(int n)
	{
		int den=2,sum=0;
		while(n!=1)
		{
			if(n%den==0)
			{
				n/=den;
				if(isPrime(den))
				{
					sum+=sumNum(den);
				}
				System.out.println(sum);
				den=2;
			}
			else{
				den++;
			}
		}
		return sum;
	}
	
	public static boolean isPrime(int n){
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