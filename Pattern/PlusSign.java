import java.util.Scanner;
class PlusSign{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		/*for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==(n+1)/2 || j==(n+1)/2 ){
					System.out.print("*"+" ");
				} 
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}*/
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==(n-1)/2 || j==(n-1)/2 ){
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