import java.util.Scanner;
class NumberSquare{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int odd=1,even=7;
		for(int i=1;i<=n;i++){
			int ans=i;
			System.out.print(ans+" ");
			for(int j=1;j<n;j++){
				if(j%2==0){
					ans+=odd;
					System.out.print(ans+" ");
				}
				else{
					ans+=even;
					System.out.print(ans+" ");
				}
			}
			System.out.println();
			odd+=2;
			even-=2;
		}
	}
}