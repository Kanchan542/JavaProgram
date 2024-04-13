class Table{
	public static void main(String args[]){
		int n=2;
		int count =1;
		do{
			System.out.println(n*count);
			count++;
		}
		while(count<=10);
		
		//using while loop
		int n2=3,count1=1;
		System.out.println("Using while loop");
		while(count1<=10){
			System.out.println(n2*count1);
			count1++;
		}
		
	}
}