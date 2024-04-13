class LargestFromFour{
	public static void main(String args[]){
		int n1=10,n2=20,n3=5,n4=12;
		int ans=n1>n2?n1:n2;
		int ans2=n3>n4?n3:n4;
		int ans3=ans>ans2?ans:ans2;
		System.out.println("Largest number from four is: "+ans3);
		
		int res1;
		int res=(n1>ans=(n2>n3?n1:n3)?n1:ans)?(n4>(ans>n1?n1:ans)?n4:ans):ans;
	}
}