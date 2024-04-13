class HammingNUmber
{
	public static void main(String args[])
	{
		int n=14;
		if(isHamming(n))
		{
			System.out.println("Number is hamming/ugly number");
		}
		else{
			System.out.println("Number is not hamming/ugly number");
		}
		
	}
	public static boolean isHamming(int n)
	{
		while(n!=1)
		{
			//int last=n%10;
			if(n%2==0){
				n/=2;
			}
			else if(n%3==0)
			{
				n/=3;
			}
			else if(n%5==0)
			{
				n/=5;
			}
			else
			{
				break;
			}
		}
		return n==1;
	}
	
}