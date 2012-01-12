package mytest;


class Vehicle{
	void make(){
		System.out.println("Vehicle.make()");
	}
}

class Car extends Vehicle{
	void make(){
		System.out.println("Car.make()");
	}
	
	void fuel(){
		System.out.println("Car.fuel()");
	}
}

class Bike extends Vehicle{
	void make(){
		System.out.println("Bike.make()");
	}
	
	void clean(){
		System.out.println("Bike.clean()");
	}
}




public class Polymorfism_ex17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] veh = {new Car(), new Bike()};  // UP-casting
		
		veh[0].make();
		veh[1].make();
		//
		((Car) veh[0]).fuel(); // Down-casting
		((Bike) veh[1]).clean();
		
		
		
	}

}
