class InchesToMetersTable {
	public static void main(String args[]) {
		double inches , meters;
		int counter;
		counter = 0;
		
		for (inches=1; inches<=144; inches++){
			meters = inches * 1 / 39.37;
			System.out.println(inches+
			" inches consist of "+ 
			meters + 
			" meters");			
			counter++;
			
			if (counter==12){
				counter = 0;
				System.out.println();
			}
		}
		}
		}