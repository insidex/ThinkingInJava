package mytest;

class AA1{
	void f1(){
		f2();
	}
	
	void f2(){
		System.out.println("AA1.f2()");
	}
}

class BB1 extends AA1{
	void f2(){
		System.out.println("BB1.f2()");
	}
}


public class EX11_polymorhysm2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA1 b = new BB1(); // up-casting
		b.f1();
		
		
	}

}
