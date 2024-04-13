class ConditionalOperater{
	public static void main(String args[]){
		/*
		int n1=51,n2=52;
		int ans=n1>n2?n1:n2;
		System.out.println(ans+" is Largest number");
	
		String ans1=n1%2==0?"is even Number":"is odd Number";
		System.out.println(n1+" "+ans1);
		
		int n3=21;
		String ans2=n3>0?"is positive number":"is negative number";
		System.out.println(n3+" "+ans2);
		
		int ans3=n1<n2?n1:n2;
		System.out.println(ans3+" Smallest number");
		*/
		
		//*************************
		//largest number from three number
		int n1=10,n2=20,n3=5;
		
		int ans1=n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3); //1
		System.out.println("Largest number among three is: "+ans1);
		
		int big=n1>n2?n1:n2;     //2
		int biggest=big>n3?big:n3;
		System.out.println("Largest number among three is: "+biggest);
		
		              
		int ans3=n1>(n2>n3?n2:n3)?n1:(n2>n3?n2:n3); //3
		System.out.println("Largest number among three is: "+ans3);
		
		
		int ans;   //4
		int ans2=n1>(ans=n2>n3?n2:n3)?n1:ans;
		System.out.println(ans2);
		
		
		int ans5=(n1>n2?n1:n2)>n3?(n1>n2?n1:n2):n3;
		System.out.println("Largest number among three is: "+ans5);
		
		
	}
}