package basicprob;
class name{
	static name obj=null;
	private name() {}
	public static name getinstance() {
		if(obj==null) 
			obj=new name();
		return obj;
		
	}
	void display() {
		System.out.print("HI Silar");
	}
}

public class singleton {

	public static void main(String[] args) {
		name a1=name.getinstance();
		a1.display();
		
		

	}

}
