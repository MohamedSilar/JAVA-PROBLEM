package basicprob;
class rect2{
     int length,width;
	public rect2(){
		length=10;
		width=20;
	}
	int area() {
		int result=length*width;
		return result;
	}
}
public class construct {
	public static void main(String args[]) {
		rect2 r1=new rect2();
		System.out.println("The Area is: " + r1.area());
	}
}
