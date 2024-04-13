import java.util.Scanner;
class PerfectNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the to check number is perfect number or not: ");
		int num=sc.nextInt();
		int sum=0,den=1;
		int temp=num;
		while(den<=num/2){
			int last=num%10;
			sum=sum+last;
			den++;
		}
		if(sum==temp){
			System.out.println("Number is perfect");
		}
		else{
			System.out.println("Number is not perfect");
		}
	}
}