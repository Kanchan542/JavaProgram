import java.util.Scanner;
class LeapSwitch{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter in which language you want answer: \n1.Marathi \n2.Hindi \n3.English");
		int choice=sc.nextInt();
		
		System.out.println("Enter the year: ");
		int year=sc.nextInt();
		
		switch(choice){
			case 1:
			{
				if(year<1582){
					System.out.println("कृपया  १ ५८२  पेक्षा मोठे  वर्ष  लिहा . ");
				}
				else if((year%4==0 && year%100!=0) || year%400==0)
				{
					System.out.println("हे  वर्ष   लिप  आहे  .");
				}
				else{
					System.out.println("हे  वर् ष.  लिप  नाही . ");
				}
				
				break;
			}
			case 2:
			{
				if(year<1582){
					System.out.println("कृपया  १ ५८२  से  बडा  साल  डलो | ");
				}
				else if((year%4==0 && year%100!=0) || year%400==0)
				{
					System.out.println("ये  साल लिप  हे  | ");
				}
				else{
					System.out.println("ये  साल लिप   नाही  |");
				}
				break;
			}
			case 3:{
				
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
				break;
			}
			
		}
		
	}
}