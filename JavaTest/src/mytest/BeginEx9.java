package mytest;

public class BeginEx9 {

		
	/**
	 * Autoboxing primitive types
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char z = 'z';
		Character zch = new Character('a');
		
		System.out.println("z is: " + z + " zch is: " + zch);
		z = zch;	// z = zch.charValue();
		System.out.println("z is: " + z + " zch is: " + zch);
		z = 'z';
		zch = z; // zch = new Character(z);
		System.out.println("z is: " + z + " zch is: " + zch);
		

	}

}
