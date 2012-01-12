package mytest;

interface test{
	final static int a = 10;
	
	void f1();
}

public class Inner_ex9 {
	
	test f2(){
		
		class ImTest implements test{
			private ImTest() {
				// TODO Auto-generated constructor stub
				System.out.println("ImTest");
			}
			
			public void f1(){
				System.out.println("f1");
				 
			}
		}
		
		return new ImTest();
		
	}
	
	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test m = new Inner_ex9().f2();
		m.f1();
		
		
		
	}

}
