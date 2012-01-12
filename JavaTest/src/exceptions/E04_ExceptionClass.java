package exceptions;

class MyException extends Exception{
	String mes;
	
	public MyException(String s) {
		mes = s;
	}
	public String getMes(){
		return mes;
	}
}


public class E04_ExceptionClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try{
			throw new MyException("My Exception");
		}catch(MyException ex){	
			System.out.println("Catch exception " + ex.getMes());
		}
		
		
	}

}
