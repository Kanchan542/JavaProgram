import java.util.Scanner;
class FactorsOfNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numberof which the factors to be find: ");
		int num=sc.nextInt();
		System.out.println("Factors of a Number: ");
		for(int i=1;i<=num;i++){
			if(num%i==0){
				System.out.print(i+" ");
			}
		}
	}
}