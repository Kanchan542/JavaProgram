import java.util.Scanner;
class ExtractDigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		while(n>0){
			int last=n%10;
			System.out.print(last+" ");
			n=n/10;
		}
	}
}