import java.util.Scanner;
class CheckZeroDuckNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int count=0;
		while(num>0){
			int last=num%10;
			if(last==0){
				count++;
			}
			num/=10;
		}
		if(count!=0){
			System.out.println("Number duck number");
		}
		else{
			System.out.println("Number is not duck number");
		}
	}
}