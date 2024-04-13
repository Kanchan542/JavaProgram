import java.util.Scanner;
class RangeOfPerfectNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start: ");
		int start=sc.nextInt();
		System.out.println("Enter the end: ");
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++){
			for(int j=i;j!=0;j/=10){
				int last=j%10;
				int sum=0;
				for(int k=1;k<=last;k++){
					//fact=fact+k;
					if(last%k==0){
						sum+=last;
					}
					//System.out.println(sum);
					
				}
				if(i==sum){
					System.out.println(i);
				}
				
				
			}
		}
	}
}