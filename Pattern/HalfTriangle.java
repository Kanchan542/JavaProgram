import java.util.Scanner;
class HalfTriangle{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=0;i<=n/2;i++){
			for(int j=0;j<n;j++){
				if((i==j) || (i+j)==n-1 || i==0){
					System.out.print("*"+" ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}