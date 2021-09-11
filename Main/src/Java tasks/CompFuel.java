class Vehicle {
	int passengers, fuelcap, kmpg;	
	
	int range() {
		return fuelcap * kmpg;
	}
	
	double fuelneeded(int km){
		return (double) km / kmpg;		
	}	
	
}

class CompFuel{
	public static void main(String args[]){
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		double gallons;
		int dist = 283;
		
		minivan.passengers = 9;
		minivan.fuelcap = 20;
		minivan.kmpg = 50;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 12;
		sportscar.kmpg = 30;
		
		gallons = minivan.fuelneeded(dist);
		System.out.println("To drive up "+ dist+" km minivan needs "+ gallons+" gallons of fuel." );				
		
		gallons = sportscar.fuelneeded(dist);
		System.out.println("To drive up "+ dist+" km sportscar needs "+ gallons+" gallons of fuel." );	
	}	
}