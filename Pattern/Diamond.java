import java.util.Scanner;
class Diamond {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int space=n/2,start=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<space;j++){
				System.out.print("  ");
			}
			for(int j=0;j<start;j++){
				System.out.print("*"+" ");
			}
			System.out.println();
			
			if(i<n/2){
				space--;
				start+=2;
			}
			else{
				space++;
				start-=2;
			}
		}
	}
}