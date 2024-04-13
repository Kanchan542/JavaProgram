class AsciiValue{
	public static void main(String args[]){
		int num=0;
		do{
			System.out.println("Ascii Value for the "+num +" is "+(char)num);
			num++;
		}
		while(num<=127);
	}
}