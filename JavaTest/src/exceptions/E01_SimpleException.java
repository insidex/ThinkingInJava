package exceptions;

import java.util.*;

public class E01_SimpleException {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = new String[5];
		
		try{
			
			System.out.println("Main block " + s[6]);
			
			
		}catch(ArrayIndexOutOfBoundsException ex){
			
			System.out.println("Catch");
			ex.printStackTrace();
		}finally{
			System.out.println("In finally block");
		}
		
		
	}

}
