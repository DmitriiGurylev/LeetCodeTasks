class sumValues {
	
	
	static int sum(int ... val){
		int sumVal = 0;
		for (int i=0; i < val.length; i++)
			sumVal += val[i];
		return sumVal;
		
	}
	
	public static void main(String args[]){
		System.out.println(sum(9,5,2,1,5));	
	}
}

