class ReversePrimeRangeUsingFor{
	public static void main(String arga[]){
		int start=50;
		int end=1;
		for(;start>=end;start--){
			int den;
			for(den=2;den<start;den++){
				if(start%den==0){
					break;
				}
			}
			if(start==den){
				System.out.println(start);
			}
		}
	}
}