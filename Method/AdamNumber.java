class AdamNumber
{
	public static void main(String args[])
	{
		int n=14;
		int squ=n*n;
		int n2=reverse(n);
		int squ2=n2*n2;
		if(squ==reverse(squ2))
		{
			System.out.println("number is adam number");
		}
		else
		{
			System.out.println("Number is not adam number");
		}
			
		
		
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