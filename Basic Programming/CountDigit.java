import java.util.Scanner;
class CountDigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int count=0;
		while(num>0){
			int last=num%10;
			count++;
			num/=10;
		}
		System.out.println("Count of digit: "+count);
	}
}