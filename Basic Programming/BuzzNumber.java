import java.util.Scanner;
class BuzzNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
	
		if((num%10)==7 || num%7==0){
			System.out.println("Buzz number");
				
		}
		else{
			System.out.println("Not buzz number");
				
		}
		
	}
}