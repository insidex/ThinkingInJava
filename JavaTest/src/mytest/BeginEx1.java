package mytest;

import javax.activation.MailcapCommandMap;

/**
 * Check default value for non-init variable
 * 
 * @author илья
 * @category Task
 * 
 */
public class BeginEx1 {
	
	public int varInt;
	public char varChar;
	
	public BeginEx1() {
		// TODO Auto-generated constructor stub
	}
	
	public void print(){
		int i=0;
		System.out.println("varInt is : "+ varInt);
		System.out.println("varChar is : "+ varChar);
		System.out.println("++i is: " + (++i));
	}
	
	public static void main(String args[]){
		new BeginEx1().print();
	}

}
