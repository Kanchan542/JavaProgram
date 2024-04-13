import java.util.Scanner;
class EvenPalindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		boolean pal=isPalindrom(n,reverse(n));
		if(pal)
		{
			if(isEven(n))
			{
				System.out.println("Even Palindrome");
			}
			else{
				System.out.println("Not even palindrome");
			}
		}
		else{
			System.out.println("not palindrome");
		}
		
	}
	public static int reverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			rev=rev*10+(n%10);
			n/=10;
		}
		return rev;
	}
	public static boolean isPalindrom(int n,int rev)
	{
		return n==rev;
	}
	public static boolean isEven(int n)
	{
		return n%2==0;
	}
}