import java.util.Scanner;
class ArmstrongNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int count=0;
		for(int i=num;i!=0;i/=10)
		{
			count++;
		}
		
		int sum=0;
		for(int i=num;i!=0;i/=10){
			int last=i%10;
			int power=1;
			for(int j=0;j<count;j++){
				power=power*last;
			}
			sum+=power;
		}
		
		if(num==sum){
			System.out.println("Armstrong number");
		}
		else{
			System.out.println("Not armstrong");
		}
	}
}