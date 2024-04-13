import java.util.Scanner;
class PerfectNumber1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int den,sum=0;
		for(den=1;den<num/2;den++){
			if(num%den==0){
				sum+=den;
			}
		}
		System.out.println(sum+" nume"+num);
		if(sum==num){
			
			System.out.println("It is perfect numnber");
		}
		else{
			System.out.println("It is not perfect number");
		}
		
	}
}