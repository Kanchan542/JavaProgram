class  UniqueNumberUsingMethod{
	public static void main(String args[])
	{
		int n=1234;
		if(isUnique(n))
		{
			System.out.println("Unique Number");
		}
		else
		{
			System.out.println("Not unique number");
		}
	}
	public static boolean isUnique(int num)
	{
		while(num!=0)
		{
			int temp=num;
			int last=temp%10;
			temp/=10;
			while(temp!=0)
			{
				if(last!=temp%10)
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
			num/=10;
			
		}
		if(num==0)
		{
			return true;
		}
		else{
			return false;
		}
		
	}
	
}