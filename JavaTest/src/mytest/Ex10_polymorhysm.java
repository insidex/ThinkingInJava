package mytest;



class AA{
	
	void f1(){
		System.out.println("AA.f1()");
	}
}

class BB extends AA{
	
	@Override
	void f1(){
		System.out.println("BB.f1()");
	}
	
}

class CC extends AA{
	@Override
	void f1(){
		System.out.println("CC.f1()");
	}
}




public class Ex10_polymorhysm {

	/**
	 * @param args
	 */
	static void f(AA a){
		a.f1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(new AA());
		f(new BB());
		f(new CC());
	}

}



