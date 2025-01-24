package basicprob;
import java.util.*;
public class reversedemo {

	public static void main(String[] args) {
		Scanner num1=new Scanner(System.in);
		System.out.print("Enter the number");
		int n=num1.nextInt();
		int reverse=0,temp;
		while(n!=0) {
			temp=n%10;
			reverse=reverse*10+temp;
			n=n/10;
		}
		System.out.print("The reverse is:" + reverse);
		

	}

}
