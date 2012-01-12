package mytest;

public class BeginEx8 {

	public static int aCount;
	
	public void print(){
		System.out.print(aCount);
	}
	
	public static void setCount(int aCount2){
		aCount = aCount2;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeginEx8[] bexArr = new BeginEx8[10];
		
		for(int i=0; i<10; i++){
			bexArr[i] = new BeginEx8();
			BeginEx8.setCount(i);
		}
		
		for(int i=0; i<10; i++){
			System.out.println(bexArr[i].aCount);
		}
		
	}

}
