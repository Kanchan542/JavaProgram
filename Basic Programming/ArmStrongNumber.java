import java.util.Scanner;
import java.lang.Math;
class ArmStrongNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int length=0;
		int temp=num;
		int sum=0,power=0;
		while(temp>0){
			temp/=10;
			length++;
			
		}
		temp=num;
		while(temp>0){
			for(int i=1;i<=length;i++){
				int last=temp%10;
			    
		4	   sum+=(Math.pow(last,length));
			   temp/=10;
			}
			
		}
		if(num==sum){
			System.out.println("ArmStrongNumber");
		}
		else{
			System.out.println("Not ArmStrongNumber");
		}
	}
}