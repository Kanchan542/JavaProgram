class LenghtConversion
{
	public static void main(String args[])
	{
		mToCm(1);
	}
	public static void mToCm(double meter){
		double cm=meter*100;
		System.out.println("Meter to cm: "+cm);
		cmToInch(cm);
	}
	public static void cmToInch(double cm)
	{
		double inch=cm*0.394;
		System.out.println("cm to Inch: "+inch);
		inchToFoot(inch);
	}
	public static void inchToFoot(double inch){
		double foot=inch*0.0833;
		System.out.println("inch to foot: "+foot); 
		footToKm(foot);
	}
	public static void footToKm(double foot)
	{
		double km=foot*0.000305;
		System.out.println("foot to km: "+km);
	}
}