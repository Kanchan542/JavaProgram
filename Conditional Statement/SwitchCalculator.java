import java.util.Scanner;
class SwitchCalculator{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		/*System.out.println("*********** Welcome to calculator*************");
		System.out.println(" 1.Addition -------(+)\n 2.Substraction------(-)\n 3.Multiplication-------(*)\n 4.Division-------(/) ");
		System.out.println("choose the option: ");
		
		int op=sc.nextInt();
		switch(op){
			case 1:
			{
				System.out.println("Enter num1:");
				int num1=sc.nextInt();
				System.out.println("Enter num2:");
				int num2=sc.nextInt();
				int sum=num1+num2;
				System.out.println("Addition of "+num1+" and "+num2+" is "+sum);
				break;
			}
			case 2:
			{
				System.out.println("Enter num1:");
				int num1=sc.nextInt();
				System.out.println("Enter num2:");
				int num2=sc.nextInt();
				int sub=num1-num2;
				System.out.println("Substraction of "+num1+" and "+num2+" is "+sub);
				break;
			}
			case 3:
			{
				System.out.println("Enter num1:");
				int num1=sc.nextInt();
				System.out.println("Enter num2:");
				int num2=sc.nextInt();
				int mul=num1*num2;
				System.out.println("Multiplication of "+num1+" and "+num2+" is "+mul);
				break;
			}
			case 4:
			{
				System.out.println("Enter num1:");
				int num1=sc.nextInt();
				System.out.println("Enter num2:");
				int num2=sc.nextInt();
				int div=num1/num2;
				System.out.println("Division of "+num1+" and "+num2+" is "+div);
				break;
			}
			default:
			{
				System.out.println("Enter correct choice");
			}
		}
		*/
		
		System.out.println("*********** Welcome to calculator*************");
		System.out.println(" 1.Addition -------(+)\n 2.Substraction------(-)\n 3.Multiplication-------(*)\n 4.Division-------(/) ");
		System.out.println("choose the option: ");
		
		int op=sc.nextInt();
		switch(op){
			case 1:
			{
				System.out.println("Enter num1:");
				double num1=sc.nextDouble();         
				System.out.println("Enter num2:");
				double num2=sc.nextDouble();
				double sum=num1+num2;
				
				System.out.println("How to you want your answer");
				System.out.println("1.Whole number");
				System.out.println("2.Decimal number");
				
				switch(sc.nextInt()){
					case 1:
					{
						System.out.println("Addition of "+(int)num1+" and "+(int)num2+" is "+(int)sum);
						break;
					}
					case 2:
					{
						System.out.println("Addition of "+num1+" and "+num2+" is "+sum);
						break;
					}
				}
				
				break;
			}
			case 2:
			{
				System.out.println("Enter num1:");
				double num1=sc.nextDouble();
				System.out.println("Enter num2:");
				double num2=sc.nextDouble();
				double sub=num1-num2;
				
				System.out.println("How to you want your answer");
				System.out.println("1.Whole number");
				System.out.println("2.Decimal number");
				
				switch(sc.nextInt()){
					case 1:
					{
						System.out.println("Addition of "+(int)num1+" and "+(int)num2+" is "+(int)sub);
						break;
					}
					case 2:
					{
						System.out.println("Addition of "+num1+" and "+num2+" is "+sub);
						break;
					}
				}
				
				
				break;
			}
			case 3:
			{
				System.out.println("Enter num1:");
				double num1=sc.nextDouble();
				System.out.println("Enter num2:");
				double num2=sc.nextDouble();
				double mul=num1*num2;
				System.out.println("How to you want your answer");
				System.out.println("1.Whole number");
				System.out.println("2.Decimal number");
				
				switch(sc.nextInt()){
					case 1:
					{
						System.out.println("Addition of "+(int)num1+" and "+(int)num2+" is "+(int)mul);
						break;
					}
					case 2:
					{
						System.out.println("Addition of "+num1+" and "+num2+" is "+mul);
						break;
					}
				}
				
				break;
			}
			case 4:
			{
				System.out.println("Enter num1:");
				double num1=sc.nextDouble();
				System.out.println("Enter num2:");
				double num2=sc.nextDouble();
				double div=num1/num2;
				
				System.out.println("How to you want your answer");
				System.out.println("1.Whole number");
				System.out.println("2.Decimal number");
				
				switch(sc.nextInt()){
					case 1:
					{
						System.out.println("Addition of "+(int)num1+" and "+(int)num2+" is "+(int)div);
						break;
					}
					case 2:
					{
						System.out.println("Division of "+num1+" and "+num2+" is "+div);
						break;
					}
				}
				
				
				break;
			}
			default:
			{
				System.out.println("Enter correct choice");
			}
		}
		
	}
}