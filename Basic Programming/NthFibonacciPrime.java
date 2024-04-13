import java.util.Scanner;
class NthFibonacciPrime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth number:");
		int n=sc.nextInt();
		
		int n1=0,n2=1,n3;
		for(int i=0;i<n-1;i++){
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		int den;
		for(den=2;den<n1;den++){
			if(n1%den==0){
				break;
			}
		}
		System.out.println(n+"th fibonacci number is "+n1);
		if(n1==den){
			System.out.println(n+"th fibonacci is prime = "+n1);
		}
		else{
			System.out.println("Nth fibonacci is not prime");
		}
	}
}