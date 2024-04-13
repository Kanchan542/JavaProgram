import java.util.Scanner;
class PronicNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int temp=1;
		for(int i=1;i<=num;i++){
			temp=i*(i+1);
			
			if(temp==num){
				break;
			}
				
			
		}
		if(temp==num){
			System.out.println("Pronic number:");
		}
		else{
			System.out.println("Not a pronic number");
		}
	}
}