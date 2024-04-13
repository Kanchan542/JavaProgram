import java.util.Scanner;
class Alphabet{
	public static void main(String args[] ){
		Scanner sc=new Scanner(System.in);
		String name=sc.nextInt();
		
		char ch=sc.next().charAt(0);
		
		
		
		switch(ch){
			case 'A':{
				for(int i=1;i<=5;i++){
					for(int j=2;j<=10;j++){
						if(i==2&&j==6 || i==3&&j==6 || i==4&&j==6 || i==5&&j==6 || i==1&&j==7 || i==1&&j==8 || i==3&&j==7 || i==3&&j==8 || i==2&&j==9 || i==3&&j==9 || i==4&&j==9 || i==5&&j==9  ){
						System.out.print("*"+" ");
						}
					else{
						System.out.print("  ");
					}
					}
					System.out.println();
				
				}
				break;
			}
			case 'B':
			{
				for(int i=1;i<=5;i++){
					for(int j=1;j<4;j++){
						if(i==1&&j==1 || i==2&&j==1 || i==3&&j==1 || i==4&&j==1 || i==5&&j==1 || i==1&&j==2 || i==1&&j==3 || i==2&&j==3 || i==3&&j==2 || i==4&&j==3 || i==5&&j==3 || i==5&&j==2){
							System.out.print("*"+" ");
						}
						else{
							System.out.print("  ");
						}
					}
					System.out.println();
				}
				break;
			}
			
		}
	}
}