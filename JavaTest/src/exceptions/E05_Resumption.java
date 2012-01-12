package exceptions;

import java.util.*;




public class E05_Resumption {

	static int num=0;
	
	static void f(int num) throws Exception{
		if(num > 0) throw new Exception("num is " + num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		int num =5;
		
		while(true){		
			try{
				f(num--);
				break;
			}catch(Exception ex){
				System.out.println("lose: " + ex.getMessage());
			}
			
		}
		
		System.out.println("win num : " + num);
		
		
	}

}
