import java.util.Scanner;
class Triangle3{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		/*for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int k=0;k<n-i;k++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		*/
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++){
				if(j<i){
					System.out.print("  ");
				}
				else{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
		
	}
}