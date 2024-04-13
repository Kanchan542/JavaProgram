class LucasNumber
{
	public static void main(String args[])
	{
		int count=1,n1=2,n2=1;
		while(count<=10)
		{
			int n3=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=n3;
			count++;
		}
	}
}