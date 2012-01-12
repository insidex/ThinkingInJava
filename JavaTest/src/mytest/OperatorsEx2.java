package mytest;

public class OperatorsEx2 {
	
	public int aNum;

	public OperatorsEx2(int aNum) {
		// TODO Auto-generated constructor stub
		this.aNum = aNum;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperatorsEx2 op1 = new OperatorsEx2(123);
		OperatorsEx2 op2 = new OperatorsEx2(456);
		
		System.out.println(op1.aNum + " " + op2.aNum);
		op1 = op2;
		System.out.println(op1.aNum + " " + op2.aNum);
		op2.aNum = 123;
		System.out.println(op1.aNum + " " + op2.aNum);
		
		

	}

}
