import java.util.Scanner;
class RangeOfPalindrome{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start: ");
		int start=sc.nextInt();
		System.out.println("Enter the end");
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++){
			int rev=0;
			for(int j=i;j!=0;j/=10){
				int last=j%10;
				rev=rev*10+last;
			}
			if(i==rev){
				System.out.println(i);
			}
		}
		
	}
}