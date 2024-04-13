class RotateNumber{
	public static void main(String args[])
	{
		int num=1234;
		System.out.println(rotate(num));
	}
	public static int rotate(int num)
	{
		
		int last=num%10;
		num/=10;
		//System.out.println(num);
		int ct=count(num);
		//System.out.println(ct);
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
}