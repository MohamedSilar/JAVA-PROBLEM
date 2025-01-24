package basicprob;

class demo{
	private int m,n;
	
	//nested method in java
	
	demo(int x ,int y){
		 m=x;
		 n=y;
		
	}
	int largest() {
		if(m>n) 
		return m;
		else
			return n;
	}
	void display() {
		int large=largest();
		System.out.println("The largest is:" + large);
	}
}

public class nestmetod {
	public static void main(String args[]) {
		demo d1=new demo(10,20);
		d1.display();
		System.out.print(d1.largest());
	}

}
