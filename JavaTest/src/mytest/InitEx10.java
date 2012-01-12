package mytest;

public class InitEx10 {
	
	int aVar;
	
	public InitEx10() {
		// TODO Auto-generated constructor stub
		aVar = 10;	
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize!");
		super.finalize();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitEx10 t1 = new InitEx10();
		InitEx10 t2 = new InitEx10();
		
		t1=null;
		t2=null;
		
		System.gc();
		
		while(true);
	}

}
