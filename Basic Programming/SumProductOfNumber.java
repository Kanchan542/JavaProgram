import java.util.Scanner;
class SumProductOfNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int sum=0,product=1;
		while(num!=0){
			int last=num%10;
			sum+=last;
			product*=last;
			num/=10;
		}
		System.out.println("Sum of digit= "+sum);
		System.out.println("Product of digit= "+product);
	}
}