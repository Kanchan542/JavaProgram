import java.util.Scanner;
class CountLeap{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting number:");
		int start=sc.nextInt();
		
		System.out.println("Enter the ending number:");
		int end=sc.nextInt();
		
		int count=0;
		
		if(start>1582){
			for(int year=start;year<=end;year++){
				if(year%4==0 && year%100!=0 || year%400==0){
					count++;
				}
			}
			System.out.println("Total leap year int the range "+start +" and "+end +" is "+count);
		}
		else{
			System.out.println("Number has to be greater than 1582");
		}
	}
}