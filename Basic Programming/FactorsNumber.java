import java.util.Scanner;
class FactorsNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int count=0;
		System.out.println("Fcators of a number: ");
		for(int i=1;i<=num;i++){
			if(num%i==0){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Count of factors: "+count);
	}
}