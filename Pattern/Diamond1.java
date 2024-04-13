import java.util.Scanner;
class Diamond1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int star=1,space=n/2;
		for(int i=0;i<n;i++){
			for(int k=0;k<space;k++){
				System.out.print("  ");
			}
			for(int j=0;j<star;j++){
				System.out.print("*"+" ");
			}
			System.out.println();
			if(i<n/2){
				space--;
				star+=2;
			}
			else{
				space++;
				star-=2;
			}
		}
	}
}