import java.util.Scanner;
class ReversePrimeRangeUsingWhile{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number from which start:");
		int start=sc.nextInt();
		System.out.println("Enter the number at which end:");
		int end=sc.nextInt();
		
		while(start>=end){
			int den=2;
			
			while(den<start){
				
				if(start%den==0){
					break;
					
				}
				den++;
			
			}
			if(den==start){
				System.out.println(start);
			}
			start--;
			
		}
		
	}
}