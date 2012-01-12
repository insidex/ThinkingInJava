package mytest;

public class OperatorsEx3 {
	
	float aVar;
	
	public void doubleMe(OperatorsEx3 op){
		op.aVar = op.aVar * op.aVar;
	}
	
	public OperatorsEx3(float aVar) {
		// TODO Auto-generated constructor stub
		this.aVar = aVar;
	}
	
	public OperatorsEx3() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float PI = (float) 3.14;
		
		
		OperatorsEx3 op1 = new OperatorsEx3(PI);
		System.out.println(op1.aVar);
		
		new OperatorsEx3().doubleMe(op1);
		
		System.out.println(op1.aVar);

	}

}
