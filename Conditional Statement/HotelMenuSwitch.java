import java.util.Scanner;
class HotelMenuSwitch{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the meal type \n1.Veg \n2.Non-Veg");
		System.out.println("select the option: ");
		int n=sc.nextInt();
		
		switch(n){
			case 1:
			{
				System.out.println("Veg menu: \n1.VadaPav-------------15/- \n2.Samosa--------------20/- \n3.Patis---------------20/- \n4.Poha----------------20/- ");
				
				int ch=sc.nextInt();
				switch(ch){
					case 1:
					{
						System.out.println("Please enter the qantity you want:");
						int qn=sc.nextInt();
						int availableQantity=10;
						if(qn<=availableQantity){
							System.out.println("Order succefully");
							double totalBill=qn*15;
						System.out.println("Your bill for "+qn+" VadaPav "+"is "+totalBill );
						}
						else{
							System.out.println("Available Qantity is "+availableQantity+" Please! order another item..");
						}
						
						break;
					}
					case 2:
					{
						System.out.println("Please enter the qantity you want:");
						int qn=sc.nextInt();
						int availableQantity=10;
						if(qn<=availableQantity){
							System.out.println("Order succefully");
							double totalBill=qn*20;
						System.out.println("Your bill for "+qn+" Samosa "+"is "+totalBill );
						}
						else{
							System.out.println("Available Qantity is "+availableQantity+" Please! order another item..");
						}
						
						break;
					
					}
					case 3:{
						System.out.println("Please enter the qantity you want:");
						int qn=sc.nextInt();
						int availableQantity=10;
						if(qn<=availableQantity){
							System.out.println("Order succefully");
						}
						else{
							System.out.println("Available Qantity is "+availableQantity+" Please! order another item..");
						}
						double totalBill=qn*20;
						System.out.println("Your bill for "+qn+" Patis "+"is "+totalBill );
						
						break;
					}
					case 4:
					{
						System.out.println("Please enter the qantity you want:");
						int qn=sc.nextInt();
						int availableQantity=10;
						if(qn<=availableQantity){
							System.out.println("Order succefully");
							double totalBill=qn*20;
						System.out.println("Your bill for "+qn+" Poha "+"is "+totalBill );
						}
						else{
							System.out.println("Available Qantity is "+availableQantity+" Please! order another item..");
						}
						
						break;
					}
					default:
					{
						System.out.println("choose the item only from menu");
					}
				}
				break;
			}
			case 2:
			{
					System.out.println("Veg menu: \n1.Burji-------------25/- \n2.Biryani-----------60/- \n3.Andakari----------30/- \n4.Chaines-----------50/- ");
				
				int ch=sc.nextInt();
				switch(ch){
					case 1:
					{
						System.out.println("Please enter the qantity you want:");
						int qn=sc.nextInt();
						int availableQantity=15;
						double totalBill=qn*25;
						if(qn<=availableQantity){
							System.out.println("Order succefully");
							System.out.println("Your bill for "+qn+" Burji "+"is "+totalBill );
						}
						else{
							System.out.println("Available Qantity is "+availableQantity+" Please! order another item..");
						}
						
						
						break;
					}
					case 2:
					{
						System.out.println("Please enter the qantity you want:");
						int qn=sc.nextInt();
						int availableQantity=10;
						if(qn<=availableQantity){
							System.out.println("Order succefully");
							double totalBill=qn*30;
						System.out.println("Your bill for "+qn+" Biryani "+"is "+totalBill );
						}
						else{
							System.out.println("Available Qantity is "+availableQantity+" Please! order another item");
						}
						
						break;
					
					}
					case 3:{
						System.out.println("Please enter the qantity you want:");
						int qn=sc.nextInt();
						int availableQantity=15;
						if(qn<=availableQantity){
							System.out.println("Order succefully");
							double totalBill=qn*20;
						System.out.println("Your bill for "+qn+" Andakari "+"is "+totalBill );
						}
						else{
							System.out.println("Available Qantity is "+availableQantity+" Please! order another item..");
						}
						
						
						break;
					}
					case 4:
					{
						System.out.println("Please enter the qantity you want:");
						int qn=sc.nextInt();
						int availableQantity=20;
						if(qn<=availableQantity){
							System.out.println("Order succefully");
							double totalBill=qn*35;
						System.out.println("Your bill for "+qn+" Chaines "+"is "+totalBill );
						}
						else{
							System.out.println("Available Qantity is "+availableQantity+" Please! order another item..");
						}
						
						break;
					}
					default:
					{
						System.out.println("choose the item only from menu");
					}
				}
				break;
			}
			
		}
		
	}
}