class Vehicle {
	int passengers, fuelcap, kmpg;	
}

class TwoVehicles{
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
		
		range_minivan = minivan.fuelcap * minivan.kmpg;
		range_sportscar = sportscar.fuelcap * sportscar.kmpg;
		
		System.out.println("Minivan can drive " + minivan.passengers + " passengers for " + range_minivan + " km.");
		System.out.println("Sportscar can drive " + sportscar.passengers + " passengers for " + range_sportscar + " km.");
		
	}				
}	