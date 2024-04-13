import java.util.Scanner;
class SwitchTrafficLight{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the color \n1.Yellow \n2.Green \n3.Red");
		String light=sc.next();
		
		switch(light){
			case "Yellow":
			{
				System.out.println("Get ready");
				break;
			}
			case "Green":{
				System.out.println("Go");
				break;
			}
			case "Red":{
				System.out.println("Stop");
				break;
			}
			default:{
				System.out.println("Enter valid color");
			}
		}
		
	}
}