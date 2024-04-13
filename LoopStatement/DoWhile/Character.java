class Character{
	public static void main(String args[]){
		char ch='A';
		do{
			System.out.println(ch);
			ch++;
		}
		while(ch<'Z');
		
		
		//Using while loop
		char ch1='A';
		System.out.println("Using while loop");
		while(ch1<='Z'){
			System.out.println(ch1);
			ch1++;
		}
		
		System.out.println("Using ascii value");
		
		int i1=65;
		while(i1<=90){
			System.out.println((char)i1);
			i1++;
		}
		
		
		int i=65;
		while(i<=90){
			System.out.println((char)i);
			i++;
		}
		
		
	}
}