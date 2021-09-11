class Vehicle {
	int passengers, fuelcap, kmpg;	
}

class VehicleDemo{
	public static void main(String args[]){
		Vehicle minivan = new Vehicle();
		
		int range;
		
		minivan.passengers = 9;
		minivan.fuelcap = 20;
		minivan.kmpg = 50;
		
		range = minivan.fuelcap * minivan.kmpg;
		System.out.println("Minivan can drive " + minivan.passengers + " passengers " + range + "km.");
	}				
}	