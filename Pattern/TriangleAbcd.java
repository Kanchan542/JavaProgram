import java.util.Scanner 	;
class TriangleAbcd{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
	}
}