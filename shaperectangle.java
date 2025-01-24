package basicprob;
import java.util.*;
//getter & setter

class rect1{
	private int length,width;
	
	//getter
	int getlenght() {
		return length;
	}
	int getwidth() {
		return width;
	}
	//setter
	void setlength(int l) {
		if(l>0)
		length=l;
		else
			length=0;
		
	}
	void setwidth(int w) {
		if(w>0)
		width=w;
		else
			width=0;
	}
	
	int area() {
		int a=length*width;
		return a;
	}
}
public class shaperectangle {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.print("Enter the length:");
		int num1=num.nextInt();
		System.out.print("Enter the width:");
		int num2=num.nextInt();
		rect1 r1=new rect1();
		r1.setlength(num1);
		r1.setwidth(num2);
		System.out.print("the area is:" + r1.area());
		

	}

}
