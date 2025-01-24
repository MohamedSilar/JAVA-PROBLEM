package basicprob;

abstract class shape{
	abstract void draw();
	void message() {
		System.out.println("HI ! SILAR");
	}
}
class rectangle12 extends shape{
	void draw() {
		System.out.println("Welcome to the virtual World");
	}
}

public class abstractprob {

	public static void main(String[] args) {
		rectangle12 r1=new rectangle12();
		r1.draw();
		r1.message();
		
	}

}
