class RangeOfPrimeUsingFor{
	public static void main(String args[]){
		int start=1;
		int end=50;
		/*
		for(;start<=end;start++){
			int den;
			
			for(den=2;den<start;den++){
				if(start%den==0){
					
					break;
				}
			}
			
			if(den==start){
				System.out.println(start);
			}
		}
		*/
		
		
		for(int i=start;i<=end;i++){
			int den;
			for(den=2;den<i;den++){
				if(i%den==0){
					break;
				}
			}
			if(den==i){
				System.out.println(i);
			}
		}
		
	}
}