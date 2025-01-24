package basicprob;

// single inheritance

class father{// base class
	public void house(){
		System.out.println("This is my house");
	}
}

class son extends father{//derived class
	public void car() {
		
		System.out.println("This is My car");
	}
}
public class singleinher {

	public static void main(String[] args) {
		son d1=new son();
		d1.car();
		d1.house();
		
		
		

	}

}
