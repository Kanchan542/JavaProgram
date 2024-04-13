import java.util.Scanner;
class Pattern{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		//int n=sc.nextInt();
		
		/*
		   1
           23
           456
           78910
		   
		   */
		//int a=10;
		/*
		for(int i=1;i<n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
		*/
		
		
		/*
		10987
        456
        32
        1
		*/
		/*
		for(int i=n;i>0;i--){
			for(int j=1;j<i;j++){
				System.out.print(a);
				a--;
			}
			System.out.println();
		}
		*/
		
		/*
		   6666
           555
           44
           3
		   
		   */
		/*
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		System.out.println("Enter the value");
		int a=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++){
				System.out.print(a);
				
			}
			a--;
			System.out.println();
		}
		*/
		int n=sc.nextInt();
		int a=sc.nextInt();
		/*for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(a);
			}
			a++;
			System.out.println();
		}
		*/
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(a+" ");
				a++;
			}
			
			System.out.println();
		}
	}
}