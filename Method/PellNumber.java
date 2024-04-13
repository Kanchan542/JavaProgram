class PellNumber
{
	public static void main(String args[])
	{
		int n1=0,n2=1,count=0;
		
		while(count<=10)
		{
			int n3=2*n2+n1;
			System.out.println(n1);
			n1=n2;
			n2=n3;
			
			count++;
		}
	}
	
}