public class Std extends Person {
	private int myIdNum;
	public Std(String name, int idNum) {
		super(name);
		myIdNum = idNum;
	}
	public int getIdNum(){
		return myIdNum;
	}
	public void setIdNum(int idNum){
		myIdNum = idNum;
	}
	public String toString(){
		return super.toString() + ", student id: " + myIdNum ;
	}

}