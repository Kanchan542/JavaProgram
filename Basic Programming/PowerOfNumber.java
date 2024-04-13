import java.util.Scanner;
class PowerOfNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base:");
		int base=sc.nextInt();
		System.out.println("Enter the raise:");
		int raise=sc.nextInt();
		int power=1;
		for(int i=1;i<=raise;i++){
			power=power*base;
		}
		System.out.println(power);
	}
}