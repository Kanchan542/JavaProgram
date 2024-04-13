import  java.util.Scanner;
class ArmStrongNumberUsingMethod{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		boolean ans=isArmStrong(n);
		System.out.println(ans);
	}
	public static boolean isArmStrong(int n)
	{
		int ct=count(n);
		int sum=0;
		for(int i=n;i!=0;i/=10)
		{
			int rem=i%10;
			sum+=power(rem,ct);
		}
		return n==sum;
	}
	public static int count(int n)
	{
		int ct=0;
		for(int i=n;i!=0;i/=10)
		{
			ct++;
		}
		return ct;
	}
	public static int power(int rem,int ct)
	{
		
		int pow=1;
		for(int j=ct;j>0;j--)
		{
			pow*=rem;
		}
		return pow;
	}
}