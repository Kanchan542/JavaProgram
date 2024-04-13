import java.utl.Scanner;
class RangeOfPrime{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int start=sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int end=sc.nextInt();
		if(isprime)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
	}
	public static int isprime(int num)
	{
		int i;
		for(i=2;i<=num;i++)
		{
			if(num%den==0)
			{
				break;
			}
		}
		if(num==i)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}