import java.util.Scanner;
class RangeOfArmStrong{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start number:");
		int start=sc.nextInt();
		System.out.println("Enter the end number ");
		int end=sc.nextInt();
		
		
		
		for(int i=start;i<=end;i++){
			int count=0;
		for(int ip=i;ip!=0;ip/=10){
			count++;
		}
		//System.out.println(count);
			int sum=0;
			for(int j=i;j!=0;j/=10){
				int last=j%10;
				int power=1;
				for(int k=0;k<count;k++){
					power=power*last;
				}
				sum+=power;
			}
			if(i==sum){
				System.out.println(i);
			}
		}
	}
}