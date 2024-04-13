class TechNumber{
	public static void main(String args[])
	{
		int num=1233;
		System.out.println(count(num));
		divide(num,count(num));
	}
	public static int count(int num)
	{
		int ct=0;
		for(int i=num;i!=0;i/=10)
		{
			ct++;
		}
		return ct;
	}
	public static void divide(int num,int ct)
	{
		int num1=0,num2=0;
		while(ct!=ct/2){
			num2=num%10;
			num/=10;
		}
		num1=num;
		System.out.println("num1 "+num1+" "+"num2 " +num2);

	}
}