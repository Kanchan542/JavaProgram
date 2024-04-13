import java.util.Scanner;
class clockSwitch{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time from am to pm");
		String time=sc.nextInt();
		
		switch(time){
			case "am":
			
			System.out.println("Enter the time");
			int time=sc.nextInt();
			if(time<=12 && time<=6){
				System.out.println("Night time");
			}
			else{
				System.out.println("Good afternoon");
			}
			
		}
	}
}