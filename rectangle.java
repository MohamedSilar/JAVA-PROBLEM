package basicprob;
//class & object
class rect{
	int length,width;
	
	void getdetails(int x,int y) {
		length=x;
		width =y;
	}
         int area() {
          int a=length * width;
        	 return a;
		
	}
}
public class rectangle {
	public static void main(String args[]) {
		rect r1 = new rect();
		r1.length=10;
		r1.width=20;
		System.out.println("The area of rectangle is:" + r1.area());
		r1.getdetails(10, 20);
		System.out.println("the area of the rectangle is:" + r1.area());
		 
		
	}

}
