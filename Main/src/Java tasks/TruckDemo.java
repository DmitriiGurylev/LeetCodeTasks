class Vehicle {
	private int passengers, fuelcap, kmpg;	
	
	Vehicle(int p1,int p2,int p3){
		passengers = p1;
		fuelcap = p2;
		kmpg = p3;
	}
	
	int range() {return fuelcap * kmpg;}
	
	double fuelneeded(int km){return (double) km / kmpg;}
	
	int getPassengers(){return passengers;}	
	int getFuelcap(){return fuelcap;}	
	int getKmpg(){return kmpg;}
	
	void setPassengers(int f){passengers = f;}	
	void setFuelcap(int f){fuelcap = f;}	
	void setKmpg(int f){kmpg = f;}
}

class Truck extends Vehicle{
	private int cargocap;
	
	Truck(int a, int s, int d, int f){
		super(a,s,d);
		cargocap = f;	
	}
	
	int getCargo(){return cargocap;}
	
	void putCargo(int g){cargocap = g;}			
}

class TruckDemo{
	public static void main(String args[]){
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);
		
		Truck truck1 = new Truck(2, 200, 7, 44000);
		Truck truck2 = new Truck(3, 28, 15, 2000);
		
		double gallons;
		int dist = 283;
		
		gallons = truck1.fuelneeded(dist);
		System.out.println("To drive up "+ dist+" km truck1 needs "+ gallons+" gallons of fuel." );				
		
		
		gallons = minivan.fuelneeded(dist);
		System.out.println("To drive up "+ dist+" km minivan needs "+ gallons+" gallons of fuel." );				
		
		gallons = sportscar.fuelneeded(dist);
		System.out.println("To drive up "+ dist+" km sportscar needs "+ gallons+" gallons of fuel." );	
	}	
}