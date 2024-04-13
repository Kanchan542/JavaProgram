import java.util.Scanner;
class NumberSquare2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int ans=i;
			for(int j=1;j<=n;j++){
				System.out.print(ans+" ");
				ans+=4;
			}
			System.out.println();
		}
	}
}