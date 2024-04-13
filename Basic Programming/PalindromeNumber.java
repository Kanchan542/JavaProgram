import java.util.Scanner;
class PalindromeNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int temp=num,rev=0;
		while(temp>0){
			int last=temp%10;
			rev=rev*10+last;
			temp/=10;
			
		}
		if(num==rev){
			System.out.println("Number is palindrom");
		}
		else{
			System.out.println("Number is not palindrom");
		}
	}
}