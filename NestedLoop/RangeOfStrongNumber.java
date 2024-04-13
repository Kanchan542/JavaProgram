import java.util.Scanner;
class RangeOfStrongNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start: ");
		int start=sc.nextInt();
		System.out.println("Enter the end: ");
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++){
			int sum=0;
			for(int j=i;j!=0;j/=10){
				int last=j%10;
		    	int fact=1;
				for(int k=1;k<=last;k++){
					fact=fact*k;
				}
				
				sum+=fact;
				
				
			}
			if(sum==i){
					System.out.println(i);
				}
			
		}
		
	}
}