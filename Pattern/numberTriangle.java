import java.util.Scanner;
class numberTriangle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int inOdd=5,inEven=2;;
		for(int i=1;i<=n;i++){
			int ans=i;
			System.out.print(ans+" ");
			for(int j=1;j<i;j++){
				if(j%2==0){
					
					ans+=inOdd;
					System.out.print(ans+" ");
				}
				else{
					System.out.print(ans+" ");
					ans+=inEven;
				}
			}
			inOdd-=2;
			inEven+=2;
			System.out.println();
		}
	}
}