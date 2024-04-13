import java.util.Scanner;
class Table{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		System.out.println("Table of: "+num);
		int n=1;
		while(n<=10){
			System.out.println(num+" * "+n+" = "+(num*n));
			n++;
		}
	}
}