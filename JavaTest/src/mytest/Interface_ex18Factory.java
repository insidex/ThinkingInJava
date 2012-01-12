package mytest;


interface Cycle{
	void make();
}

class Unicycle implements Cycle{
	public void make(){
		System.out.println("Unicycle.make()");
	}
}

class Bicycle implements Cycle{
	public void make(){
		System.out.println("Bicycle.make()");
	}
}

class Tricycle implements Cycle{
	public void make(){
		System.out.println("Tricycle.make()");
	}
	
}


class FactroyCycle{
	static Bicycle makeUni(){
		return new Bicycle();
	}
}


public class Interface_ex18Factory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicycle uni = FactroyCycle.makeUni();
		

	}

}
