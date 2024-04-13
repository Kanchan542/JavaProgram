class FermatNumber
{
	public static void main(String args[])
	{
		int n=6;
		for(int i=0;i<n;i++)
		{
			long ans1=(power(2,(power(2,i))))+1;
			System.out.println(ans1);
		}
		
		
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