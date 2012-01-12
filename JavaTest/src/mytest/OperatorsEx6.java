package mytest;

public class OperatorsEx6 {
	
	String aDogName;
	String aDogSound;

	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperatorsEx6 op1 = new OperatorsEx6();
		op1.aDogName = "Bolonka";
		op1.aDogSound = "Lau-lau";
		
		OperatorsEx6 op2 = new OperatorsEx6();
		op2.aDogName = "Bolonka";
		op2.aDogSound = "Lau-lau";
		
		
		String str1 = new String("abc");
		String str2 = new String("abcd");
		
		
		//str1 = str2;
		
		System.out.println(str1.equals(str2));
		
	}

}
