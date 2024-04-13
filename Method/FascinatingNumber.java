class FascinatingNumber
{
	public static void main(String args[])
	{
		int n=190;
		int ans1=0,ans2=0,ans=0;
		if(count(n)>=3)
		{
			ans1=n*2;
			ans2=n*3;
		}
		
		ans=n*power(10,count(ans1))+ans1;
		
		ans=ans*power(10,count(ans2))+ans2;
		System.out.println(ans);
		
		if(isFascinating(ans))
		{
			System.out.println("Fascinating Number");
		}
		else
		{
			System.out.println("Not Fascinating Number");
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
	/*public static int count(int n)
	{
		int ct=0;
		for(int i=n;i!=0;i/=10)
		{
			ct++;
		}
		return ct;
	}*/
	public static int power(int rem,int ct)
	{
		int pow=1;
		for(int i=1;i<=ct;i++)
		{
			pow*=rem;
		}
		//System.out.println(pow);
		return pow;
	}
	public static boolean isFascinating(int n)
	{
		
		while(n!=0)
		{
			int temp=n;
			int last=n%10;
			if(last==0)
			{
				return false;
				//break;
			}
			temp/=10;
			while(temp!=0)
			{
				if(last!=temp%10)
				{
					temp/=10;
				}
				else{
					break;
				}
			}
			if(temp!=0)
			{
				break;
			}
			n/=10;
		}
		if(n==0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
}