import java.util.Scanner;
class PrimeNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int rev=0,den=2;
		while(den<num){
			if(num%den==0){
				break;
			}
			den++;
		}
		if(num==den){
			System.out.println("Number is prime");
		}
		else{
			System.out.println("Number is not prime number");
		}
	}
}