class Vehicle {
	int passengers, fuelcap, kmpg;	
	
	Vehicle(int p1,int p2,int p3){
		passengers = p1;
		fuelcap = p2;
		kmpg = p3;
	}
	
	int range() {
		return fuelcap * kmpg;
	}
	
	double fuelneeded(int km){
		return (double) km / kmpg;		
	}
}

class VehConsDemo{
	public static void main(String args[]){
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);
		
		double gallons;
		int dist = 283;
		
		gallons = minivan.fuelneeded(dist);
		System.out.println("To drive up "+ dist+" km minivan needs "+ gallons+" gallons of fuel." );				
		
		gallons = sportscar.fuelneeded(dist);
		System.out.println("To drive up "+ dist+" km sportscar needs "+ gallons+" gallons of fuel." );	
	}	
}