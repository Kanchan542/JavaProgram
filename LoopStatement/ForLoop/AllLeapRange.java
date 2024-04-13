import java.util.Scanner;
class AllLeapRange{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting year: ");
		int start=sc.nextInt();
		
		System.out.println("Enter the ending year: ");
		int end=sc.nextInt();
		
		if(start>1582){
			for(int year=start;year<=end;year++){
				if((year%4==0 && year%100!=0) || year%400==0){
				System.out.println(year);
				}
			}
			
		}
		 else{
			 System.out.println("The number enter has to be greater than 1582");
			
		 }
		
	}
}