import java.util.Scanner;
class RightRombus{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		
		for(int i=0;i<n;i++){
			for(int space=0;space<n-i-1;space++){
				System.out.print(" "+" ");
			}
			for(int j=0;j<n;j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}