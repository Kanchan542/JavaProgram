import java.util.Scanner;
class NumberTriangle1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter the number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int val=n-1;
			int ans=i;
			for(int j=1;j<=i;j++){
				System.out.print(ans+" ");
				ans+=val;
				val--;
			}
			System.out.println();
		}
		*/
		
		int n=4;
		for(int i=1;i<=n;i++){
			int val=i;
			System.out.print(val+" ");
			for(int j=1;j<i;j++){
				
				val=val+(n-j);
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
}