class EulerianNumber
{
	public static void main(String args[])
	{
		int n=132,count=0;
		while(n>9)
		{
			int last=n%10;
			n/=10;
			int sectLast=n%10;
			if(last>sectLast)
			{
				count++;
			}
			
			
			
		}
		System.out.println("Count "+count);
	}
	
}