import java.util.Scanner;
class PrimeOrNot
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(isPrime(num)==true)
		{
			System.out.println("Number is prime");
		}
		else{
			System.out.println("Number is not prime");
		}
		
	}
	public static boolean isPrime(int num)
	{
		int den=2;
		while(num!=0){
			if(num%den==0){
				break;
			}
			

			den++;
		}
		if(num==den)
		{
			return true;
		}
		else{
			return false;
		}
	}
}