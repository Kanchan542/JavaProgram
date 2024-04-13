class ArmStrongNumber
{
	public static void main(String args[])
	{
		armStrong(153);
	}
	public static void armStrong(int num)
	{
		int count=0;
		for(int i=num;i!=0;i/=10)
		{
			count++;
		}
		int sum=0;
		for(int i=num;i!=0;i/=10)
		{
			int last=i%10;
			int pow=1;
			for(int j=1;j<=count;j++)
			{
				pow=pow*last;
			}
			sum+=pow;
		}
		if(num==sum){
			System.out.println("Armstrong number");
		}
		else{
			System.out.println("Non armstrong number");
		}
	}
}