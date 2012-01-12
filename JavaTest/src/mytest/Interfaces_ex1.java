package mytest;

interface Branch{
	void create();
	void makeLonger();
}

interface Sheet{
	void create();
	void makeGreen();
}

interface Cork{
	void create();
	void makeWider();
}
////////////////
class Life{
	void twice(){
		System.out.println("Life.twice()");
	}
	void create(){
		System.out.println("Life.create()");
	}
	void makeLonger(){
		System.out.println("Life.makeLonger()");
	}
}
////////////////
class Tree extends Life implements Branch, Cork, Sheet{
	public void create(){
		System.out.println("Tree.create()");
	}

	@Override
	public void makeGreen() {
		System.out.println("Tree.makeGreen()");
		
	}

	@Override
	public void makeWider() {
		// TODO Auto-generated method stub
		System.out.println("Tree.makeWider()");
		
	}
	public void makeLonger() {
		// TODO Auto-generated method stub
		System.out.println("Tree.makeLonger()");
	}
	
}


public class Interfaces_ex1 {

	static void makeTree(Branch b, Sheet s, Cork c){
		b.create();
		
		b.makeLonger();
		s.makeGreen();
		c.makeWider();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Branch branch = new Tree();
		Sheet sheet = new Tree();
		Cork cork = new Tree();
		
		makeTree(branch, sheet, cork);
		
		

	}

}
