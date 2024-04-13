class Decrement{
	public static void main(String args[]){
		int a=20;
		System.out.println(--a);  //19
		System.out.println(a--);  //19
		System.out.println(--a);  //17
		System.out.println(a-- + --a);  //32
		System.out.println(a);  //15
		System.out.println(a--); //15
		System.out.println(--a + --a);  //25
		System.out.println(a-- + a--);  //23
	}
}