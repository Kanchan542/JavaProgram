import java.util.Scanner;
class LeftRombus{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=n;i>0;i--){
			for(int space=0;space<n-i;space++){
				System.out.print("  ");
			}
			for(int j=0;j<n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}