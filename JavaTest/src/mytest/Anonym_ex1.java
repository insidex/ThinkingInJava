package mytest;


abstract class Anonym{
	public Anonym(int x){
		System.out.println("Anonym() " + x);
	}

	abstract void f2();
}

public class Anonym_ex1 {
	
	
	static Anonym f1(final int x){
		return new Anonym(x) {
			public void f2(){
				System.out.println("Anonym.f2()");
			}
		};
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		f1(42).f2();
	}

}
