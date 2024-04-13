class IncrementOp{
	public static void main(String args[]){
		/*int a=10;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a++ + ++a);
		System.out.println(++a - ++a);
		System.out.println(a);
		*/
		
		/*
		int a=5,b=10,c=26,d;
		d=a+ ++b + --c;
		a=d++ *10- ++b;
		b=a-b++;
		c=-b + ++c;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		System.out.println("d= "+d);
		*/
		
		int p=-2,q=8,s;
		int r=p+q;
		++q;
		s=q--;
		r=p+ q++ + -s--;
		q=q--;
		System.out.println("p= "+p);
		System.out.println("q= "+q);
		System.out.println("r= "+r);
		System.out.println("s= "+s);
	}
}