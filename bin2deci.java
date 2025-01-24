package basicprob;
import java.util.*;

public class bin2deci {
	public static int decimal1(int num1) {
		int deci=0,power=0;
		while(num1!=0) {
			int remi=num1%10;
			deci +=remi*Math.pow(2, power);
			num1=num1/10;
			power++;
		}
		return deci;
	}
	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num1=num.nextInt();
		System.out.print("The number is:" + decimal1(num1));
	}

}
