import java.util.Scanner;
class NeonNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int sqr=num*num;
		int temp=sqr;
		int sum=0;
		while(temp!=0){
			int last=temp%10;
			sum+=last;
			temp/=10;
		}
		
		if(num==sum){
			System.out.println("neon Number");
		}
		else{
			System.out.println("Not neon number");
		}
	}
}