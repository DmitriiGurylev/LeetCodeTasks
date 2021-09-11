class Bubble{
	public static void main(String args[]){
		
		int t;
		int nums[] = {1,7,3,0,-124,6146,43,4,1,6,643,2,1,6};
		int size = nums.length;	
		
		System.out.print("Primary array:");
		for (int i=0; i < size; i++)
			System.out.print(" " + nums[i]);
		System.out.println();	
		
		for (int i=1; i < size; i++)
			for (int j=size-1; j>=i; j--)
				if (nums[j-1] > nums[j]){
					t = nums[j];
					nums[j] = nums[j-1];
					nums[j-1]=t;
				}
		
		System.out.print("Secondary array:");
		for (int i=0; i < size; i++)
			System.out.print(" " + nums[i]);		
		
	}
}	