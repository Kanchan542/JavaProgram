import java.util.Scanner;
class SpyNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		int sum=0,product=1;
		for(int i=num;i!=0;i/=10){
			int last=i%10;
			sum+=last;
			product*=last;
			
		}
		//System.out.println("Sum"+sum+"Product"+product);
		if(sum==product){
			System.out.println("Spy number");
		}
		else{
			System.out.println("Not spy number");
		}
	}
}