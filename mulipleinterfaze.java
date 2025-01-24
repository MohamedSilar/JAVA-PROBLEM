package basicprob;
class phone{
	void display() {
	
	System.out.println("Good display");
	}
	void camera() {
	
		System.out.print("Goood camera");
	}
	
}
interface music{
	void pause();
	void play();
	void stop();
}
interface cam{
	void click();
	void record1();
}
class smartphone extends phone implements music,cam{

	@Override
	public void click() {
		System.out.println("click me");
		
	}

	@Override
	public void record1() {
		System.out.println("record me");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		System.out.println("pause me");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		System.out.println("play me");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		System.out.println("stop me");
		// TODO Auto-generated method stub
		
	}
	
}

public class mulipleinterfaze {

	public static void main(String[] args) {
	
		smartphone s1=new smartphone();
		s1.click();
		s1.pause();
		s1.stop();
		s1.record1();
		s1.play();

	}

}
