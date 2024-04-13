import java.util.Scanner;
class LeapYear{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year=sc.nextInt();
		if(year<1582){
			System.out.println("The year has to be greter than 1582.Beause the gregoreon year start from 1582");
		}
		else if((year%4==0 && year%100!=0) || year%400==0)
		{
			System.out.println("It is leap year ");
		}
		else{
			System.out.println("It is not leap year");
		}
	}
}