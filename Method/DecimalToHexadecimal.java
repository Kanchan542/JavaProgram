class DecimalToHexadecimal
{
	public static void main(String args[])
	{
		int n=123122;
		System.out.println(decimalToHexadecimal(n));
	}
	/*public static String decimalToHexadecimal(int n)
	{
		String ans=" ";
		while(n!=0)
		{
			int rem=n%16;
			if(rem>=0 && rem<=9)
			{
				ans=rem+ans;
			}
			else if(rem>=10 && rem<=15)
			{
				switch(rem)
				{
					case 10:
					{
						ans='A'+ans;
						break;
					}
					case 11:
					{
						ans='B'+ans;
					}
					case 12:
					{
						ans='C'+ans;
						break;
					}
					case 13:
					{
						ans='D'+ans;
						break;
					}
					case 14:
					{
						ans='E'+ans;
						break;
					}
					case 15:
					{
						ans='F'+ans;
						break;
					}
				}
			}
			n/=16;
		}
		
		return ans;
	}*/
	
	public static String decimalToHexadecimal(int n)
	{
		String ans=" ";
		while(n!=0)
		{
			int rem=n%16;
			if(rem>=0 && rem<=9)
			{
				ans=rem+ans;
			}
			else if(rem>=10 && rem<=15)
			{
				ans=(char)(rem+55)+ans;
			}
			n/=16;
		}
		return ans;
	}
}