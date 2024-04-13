import java.util.Scanner;
class StrongNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=num;i!=0;i/=10){
			int last=i%10;
			int fact=1;
			for(int j=1;j<=last;j++){
				fact=fact*j;
			}
			sum+=fact;
		}
		if(sum==num){
			System.out.println("Strong number");
		}
		else{
			System.out.println("Not a strong");
		}
	}
}