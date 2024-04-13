import java.util.Scanner;
class OriginalAndReverseEven{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int temp=num,rev=0;
		if(num%2==0){
			while(temp>0){
				int last=temp%10;
				rev=rev*10+last;
				temp/=10;
						
			}
			if(rev%2==0){
				System.out.println("Number is twisted:  "+num);
			}
			else{
				System.out.println("Not twisted number");
			}
		}
		else{
			System.out.println("Given number is odd");
		}
	}
}