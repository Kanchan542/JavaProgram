class Addition{
	public static void main(String args[])
	{
		add(5,6);
		add(25.20,45.66);
		sub(40,20);
		mul(2f,4f);
		div(10,2);
		div1(10,2);
		power(29,4);
		
	}
	public static void add(int a,int b)
	{
		int res=a+b;
		System.out.println("result in int: "+res);
	}
	public static void add(double c,double d)
	{
		double res=c+d;
		System.out.println("Result in double: "+res);
	}
	public static void sub(int a,int b)
	{
		int res=a-b;
		System.out.println("Result of substraction: "+res);
	}
	public static void mul(float a,float b)
	{
		float res=a*b;
		System.out.println("Result of multiplication: "+res);
		
	}
	public static void div(int a,int b)
	{
		int res=a/b;
		System.out.println("Result of division: "+res);
	}
	public static void div1(double a,double b)
	{
		double res=a/b;
		System.out.println("Result of division in double:"+res);
	}
	public static void power(int base,int raise)
	{
		int pow=1;
		for(int i=1;i<=raise;i++)
		{
			pow*=base;
			
		}
		System.out.println("power is:" +pow);
	}
}