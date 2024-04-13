class CharacterConversion
{
	public static void main(String args[])
	{
		character('B');
		
	}
	public static void character(char ch)
	{
		if(ch>='a'&&ch<='z')
		{
			System.out.println((char)(ch-32));
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println((char)(ch+32));
		}
		else{
			System.out.println("Not an alphabet");
		}
	}
}