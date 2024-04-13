import java.util.Scanner;
class KPattern{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the i: ");
		int n=sc.nextInt();
		System.out.println("Enter the j: ");
		int m=sc.nextInt();
		System.out.println("Enter the character: ");
		char ch=sc.next().charAt(0);
		System.out.println("KANCHAN");
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=m;j++){
				if(i==1&&j==1 || i==2&&j==1 || i==3&&j==1 || i==4&&j==1 || i==5&&j==1 || i==1&&j==4 || i==2&&j==3 || i==3&&j==2 ||  i==4&&j==3 || i==5&&j==4 
				)
				{
					System.out.print(ch+" ");
				}
				else if(i==2&&j==6 || i==3&&j==6 || i==4&&j==6 || i==5&&j==6 || i==1&&j==7 || i==1&&j==8 || i==3&&j==7 || i==3&&j==8 || i==2&&j==9 || i==3&&j==9 || i==4&&j==9 || i==5&&j==9  ){
					System.out.print(ch+" ");
				}
				else if(i==1&&j==11 || i==2&&j==11 || i==3&&j==11 || i==4&&j==11 || i==5&&j==11 || i==2&&j==12 || i==3&&j==13 || i==4&&j==14 || i==1&&j==15 || i==2&&j==15 || i==3&&j==15 || i==4&&j==15 ||  i==5&&j==15 ){
					System.out.print("*"+" ");
				}
				else if(i==2&&j==17 || i==3&&j==17 || i==4&&j==17 || i==1&&j==18 || i==1&&j==19 || i==5&&j==18 || i==5&&j==19 ){
					System.out.print("*"+" ");
				}
				else if(i==1&&j==21 || i==2&&j==21 || i==3&&j==21 || i==4&&j==21 || i==5&&j==21 || i==3&&j==22 || i==3&&j==23 || i==1&&j==24 || i==2&&j==24 || i==3&&j==24 || i==4&&j==24 || i==5&&j==24){
					System.out.print("*"+" ");
				}
				else if(i==2&&j==26 || i==3&&j==26 || i==4&&j==26 || i==5&&j==26 || i==3&&j==27 || i==3&&j==28 || i==1&&j==27 || i==1&&j==28 || i==2&&j==29 || i==3&&j==29 || i==4&&j==29 || i==5&&j==29 ){
					System.out.print("*"+" ");
				}
				else if(i==1&&j==31 || i==2&&j==31 || i==3&&j==31 || i==4&&j==31 || i==5&&j==31 || i==2&&j==32 || i==3&&j==33 || i==4&&j==34 || i==1&&j==35  || i==2&&j==35  || i==3&&j==35  || i==4&&j==35  || i==5&&j==35 ){
					System.out.print("*"+" ");
				}
				else{
					System.out.print("  ");
				}
				
				
			}
			System.out.println();
		}
	}
}