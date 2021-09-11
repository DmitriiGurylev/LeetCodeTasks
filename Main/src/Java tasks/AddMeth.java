class Vehicle {
	
	int passengers, fuelcap, kmpg;	
	
	void range() {
		System.out.println("Range " + fuelcap * kmpg + " km.");
		}
	
}

class AddMeth{
	public static void main(String args[]){
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range_minivan, range_sportscar;
		
		minivan.passengers = 9;
		minivan.fuelcap = 20;
		minivan.kmpg = 50;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 12;
		sportscar.kmpg = 30;
		
		
		
		
		System.out.print("Minivan can drive " + minivan.passengers + " passengers. ");
		minivan.range();
		
		System.out.print("Sportscar can drive " + sportscar.passengers + " passengers. ");
		sportscar.range();
	}				
}	