import java.util.Scanner;
class SumIsPrime{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int sum=0;
		
		/*while(num!=0)
		{
			int last=num%10;
			sum+=last;
			num/=10;
		}
		int den=2;
		while(den<sum){
			if(sum%den==0){
				break;
			}
			den++;
		}*/
		
		for(int i=num;i!=0;i/=10){
			int last=i%10;
			sum+=last;
		}
		//System.out.println(sum);
		int den;
		for(den=2;den<sum;den++){
			if(sum%den==0){
				break;
			}
		}
		if(den==sum){
			System.out.println("Sum is prime");
		}
		else{
			System.out.println("Sum is not prime");
		}
	}
}