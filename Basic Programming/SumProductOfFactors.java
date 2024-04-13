import java.util.Scanner;
class SumProductOfFactors{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int sum=0,product=1;
		for(int i=1;i<=num;i++){
			int last=num%10;
			if(last%i==0){
				sum+=last;
				product*=last;
			}
			
		}
		System.out.println(sum);
		System.out.println(product);
		if(sum==product){
			System.out.println("Sum and product is same: "+sum+","+product);
		}
		else{
			System.out.println("Sum and product are not same");
		}
	}
}