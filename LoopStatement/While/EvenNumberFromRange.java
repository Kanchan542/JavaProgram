import java.util.Scanner;
class EvenNumberFromRange{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start number: ");
		int start =sc.nextInt();
		System.out.println("Enter the end number: ");
		int end =sc.nextInt();
		System.out.println("All the even number from "+start+" to "+end);
		while(start<=end){
			if(start%2==0){
				System.out.println(start);
				
			}
			start++;
		}
	}
}