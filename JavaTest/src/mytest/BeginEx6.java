package mytest;

public class BeginEx6 {
	
	private String aName;
	private String aSurName;
	
	public BeginEx6(String aName, String aSurname){
		storage(aName, aSurname);
	}
	
	
	private void storage(String aName, String aSurName){
		this.aName = aName;
		this.aSurName = aSurName;
	}
	
	public void print(){
		System.out.println(aName +" "+ aSurName);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeginEx6 storage = new BeginEx6("Martin", "King");
		storage.print();
	}

}
