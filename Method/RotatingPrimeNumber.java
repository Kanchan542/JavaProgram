class RotatingPrimeNumber
{
	public static void main(String args[]){
		int num=13;
		System.out.println(rotate(num)+" "+isPrime(num));
		int temp=num;
		if(isPrime(num))
		{
			num=rotate(num);
			while(temp!=num)
			{
				if(!isPrime(num)){
					break;
				}
				num=rotate(num);
			}
			if(temp==num){
				System.out.println("Rotatary prime");
			}
			else{
				System.out.println("Not Rotatary prime");
			}
			
		}
		else
		{
			System.out.println("not prime");
		}
		
	}
	public static int rotate(int num)
	{
		int last=num%10;
		num/=10;
		int ct=count(num);
		int ans=last*power(10,ct)+num;
		return ans;
		
	}
	public static int count(int num)
	{
		int ct=0;
		for(int i=num;i!=0;i/=10)
		{
			ct++;
		}
		return ct;
	}
	public static int power(int rem,int ct)
	{
		int pow=1;
		for(int i=1;i<=ct;i++)
		{
			pow*=rem;
		}
		return pow;
	}
	public static boolean isPrime(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
}