package basicprob;
import java.util.*;

public class palindromdemo {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num1=num.nextInt();
		int temp,reverse=0;
		 int original=num1;
		while(num1!=0) {
			temp=num1%10;
			reverse=reverse*10+temp;
			num1=num1/10;
		}
		if(original==reverse) {
			System.out.println("the number is palindrome:" + reverse);
		}else {
			System.out.println("The number is not a palindrome" + reverse);
		}
		
		

	}

}
