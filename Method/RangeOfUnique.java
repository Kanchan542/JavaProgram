class RangeOfUnique
{
	public static void main(String args[])
	{
		int start=1;
		int end=1000;
		while(start<=end)
		{
			if(isUnique(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}
	public static boolean isUnique(int n)
	{
		while(n!=0)
		{
			int temp=n;
			int last=temp%10;
			temp/=10;
			while(temp!=0)
			{
				if(last==temp%10)
				{
					temp/=10;
				}
				else
				{
					break;
				}
				
			}
			if(temp!=0)
			{
				break;
			}
			n/=10;
			
		}
		if(n!=0)
		{
			return true;
		}
		else{
			return false;
		}
	}
	
}