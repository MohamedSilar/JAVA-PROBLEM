package basicprob;

abstract class mobile{
	void voicecall() {
		System.out.println("Voice call accepted");
	}
	abstract void camera();
	abstract void display();
}
class samsung extends mobile{
	
	void camera() {
		System.out.println("32 mega pic sals");
	}
	void display() {
		System.out.println("10 inch display required");
		
	}
	void gaming() {
		System.out.println("It requierd Pubg");
	}
	void audio() {
		System.out.println("It has highly requierd audio");
	}
	
}
class iqoo extends mobile{
	void camera() {
		System.out.println("100 mega picsal");
	}
	void display() {
		System.out.println("17 inch size");
		
	}
	void gaming() {
		System.out.println("it has 8200 snapdragon");
	}
}

public class abstract2demo {

	public static void main(String[] args) {
		samsung s1 =new samsung();
		s1.audio();
		s1.camera();
		s1.display();
		s1.gaming();
		s1.voicecall();
		System.out.println("-----------------------------");
		
		iqoo q1= new iqoo();
		q1.camera();
		q1.display();
		q1.gaming();
		q1.voicecall();
	
	
	}

}
