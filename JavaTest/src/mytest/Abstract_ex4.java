package mytest;

abstract class Car2{
	abstract public void getName();
	
	
	public String color;
}

class Bike2 extends Car2{

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		
		System.out.println("CAR");
		
	}
	
	
}


public class Abstract_ex4 {
	
	static void getName(Car2 mycar){
				
		mycar.getName();
		

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 cc = new Bike2();
		getName(cc);
		
	}

}
