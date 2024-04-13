import java.util.Scanner;
class TwistedPrimeUsingForLoop{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int den,rev=0;
		for(den=2;den<num;den++){
			if(num%den==0){
				break;
			}
		}
		if(num==den){
			for(int i=num;i!=0;i/=10){
				rev=rev*10+(i%10);
				
			}
			
			System.out.println(rev);
			for(den=2;den<rev;den++){
				if(rev%den==0){
					break;
				}
			}
			System.out.println(rev+" "+den) ;
			if(rev==den){
				System.out.println("Number is twisted prime");
			}
			else{
				System.out.println("Number is prime but not twisted");
			}
		}
		else{
			System.out.println("Nummber is not prime");
		}
	}
}