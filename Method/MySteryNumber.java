class MySteryNumber
{
	public static void main(String args[])
	{
		int num=111;
		if(isMystery(num))
		{
			System.out.println("Mystery number");
		}
		else
		{
			System.out.println("Not MySteryNumber");
		}
	}
	public static boolean isMystery(int num)
	{
		int n=11;
		while(true)
		{
			int rev=reverse(n);
			//System.out.println(n+" "+rev);
			if(n+rev==num)
			{
				System.out.println(n+" "+rev);
				return true;
			}
			else if(n+rev<num)
			{
				n++;
			}
			else{
				break;
			}
		}
		return false;
	}
	public static int reverse(int n)
	{
		int rev=0;
		for(int i=n;i!=0;i/=10)
		{
			int last=i%10;
			rev=rev*10+last;
		}
		return rev;
	}
}