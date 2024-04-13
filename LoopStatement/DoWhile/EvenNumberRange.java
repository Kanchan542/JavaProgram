import java.util.Scanner;
class EvenNumberRange{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start: ");
		int start=sc.nextInt();
		System.out.println("Enter the end");
		int end=sc.nextInt();
		
		do{
			if(start%2==0){
				System.out.println(start);
			}
			start++;
			
		}
		while(start<=end);
	}
}