import java.util.Scanner;
class NthFibonacciNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth number: ");
		int n=sc.nextInt();
		int n1=0,n2=1,n3,temp=n;
		for(int i=1;i<n;i++){
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		
		System.out.println(temp+"th fibonacci number is "+n1);
	}
}