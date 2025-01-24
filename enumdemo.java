package basicprob;
// enumuration in java

public class enumdemo {
	enum gamelevel{
		low,
		medium,
		high
	}
	public static void main(String[] args) {
		gamelevel a=gamelevel.high;
		System.out.println(a);
		
		switch(a) {
		case low:
			System.out.print("Low level");
			break;
		case medium:
			System.out.print("medium level");
			break;
		case high:
			System.out.println("high level");
			break;
		}
		for(gamelevel level : gamelevel .values()) {
			System.out.println(level);
		}
		
	}


}
