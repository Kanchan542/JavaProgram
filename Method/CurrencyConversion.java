class CurrencyConversion
{
	public static void main(String args[])
	{
		rupeesToDoller(100);
	}
	public static void rupeesToDoller(double rupee)
	{
		double doller=rupee/82.92;
		System.out.println("Rupees to doller: "+doller);
		dollerToDihram(doller);
	}
	public static void dollerToDihram(double doller)
	{
		double dihram=doller*3.67;
		System.out.println("value of doller to dihram: "+dihram);
		dihramToEuro(dihram);
		
	}
	public static void dihramToEuro(double dihram)
	{
		double euro=dihram/4;
		System.out.println("Value of dihram to euro: "+euro);
	}
}