
//alternate alphabet
class AlternateAlphabet{
	public static void main(String args[]){
		char ch='A';
		int count=0;
		System.out.println("Alternate alphabet from A to Z");
		while(ch<='Z'){
			System.out.println(ch);
			ch+=2;
			count++;
		}
		System.out.println("Count of alternate character is:"+count);
	}
}