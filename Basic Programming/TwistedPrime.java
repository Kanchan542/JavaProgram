import java.util.Scanner;
class TwistedPrime{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int den=2;
		while(den<num){
			if(num%den==0){
				break;
			}
			den++;
		}
		if(num==den){
			int rev=0;
			while(num!=0){
				rev=rev*10+(num%10);
				num/=10;
			}
			while(den<rev){
				if(rev%den==0){
					break;
				}
				den++;
			}
			if(rev==den){
				System.out.println("Number is twisted prime");
			}
			else{
				System.out.println("Number is prime but bot twisted");
			}
		}
		else{
			System.out.println("Number is not prime");
		}
	}
}