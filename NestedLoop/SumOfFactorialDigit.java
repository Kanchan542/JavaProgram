import java.util.Scanner;
class SumOfFactorialDigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0){
			int last=num%10;
			int fact=1;
			for(int i=1;i<=last;i++){
				fact=fact*i;
			}
			sum+=fact;
			
			num/=10;
		}
		System.out.println("Sum of fcatorial of number is: "+sum);
	}
}