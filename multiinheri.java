package basicprob;

//multilevel Inheritance
class grandfather{
	public void house() {
		System.out.print("This my house");
	}
}
class father1 extends grandfather{
	public void land() {
		System.out.println("This my 4ac Land");
		
	}
}
 class son1 extends father1{
	public void car() {
		System.out.println("This is my car");
	}
}
public class multiinheri {

	public static void main(String[] args) {
		son1 d1 =new son1();
		d1.car();
		d1.land();
		d1.house();
		
	}

}
