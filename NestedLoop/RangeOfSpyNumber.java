import java.util.Scanner;
class RangeOfSpyNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start");
		int start=sc.nextInt();
		System.out.println("Enter the end");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++){
			int sum=0,product=1;
			for(int j=i;j!=0;j/=10){
				int last=j%10;
				sum+=last;
				product*=last;
			}
			if(sum==product){
				System.out.println(i);
			}
		}
	}
}