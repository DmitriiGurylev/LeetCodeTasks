class Vehicle {
	int passengers, fuelcap, kmpg;		
	int range() {
		return fuelcap * kmpg;
		}	
}

class RetMeth{
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
		
		System.out.println("Minivan can drive " + minivan.passengers + " passengers for " + minivan.range() + " km.");				
		System.out.println("Sportscar can drive " + sportscar.passengers + " passengers for " + sportscar.range() + " km.");	
	}				
}	