import java.util.Scanner;
class LCM{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two mnumber: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int big=n1>n2?n1:n2;
		while(true){
			if(big%n1==0 && big%n2==0){
				System.out.println(big);
				break;
			}
			big++;
			
		}
		
	}
}