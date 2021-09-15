class TestSwap {
	int a;
	TestSwap(int i) { a = i; }
	
	public static void swap(TestSwap ob1, TestSwap ob2){
		int u;
		u = ob1.a;
		ob1.a = ob2.a;
		ob2.a = u;
	}
	
	public static void main (String args[]){
		TestSwap object1 = new TestSwap(10);
		TestSwap object2 = new TestSwap(15);
		
		System.out.println(object1.a + " " + object2.a);		
		
		swap(object1, object2);
		
		System.out.println(object1.a + " " + object2.a);
		
		
		
		}

}
		
