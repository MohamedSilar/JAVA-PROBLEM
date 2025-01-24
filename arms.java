package basicprob;
import java.util.*;

public class arms {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num1 =num.nextInt();
		int digit1 , digit2 , digit3 ;
		int temp = num1;
		
			digit3=temp%10;
			temp/=10;
			
			digit2=temp%10;
			temp/=10;
			
			digit1=temp%10;
		
			int result =(digit1 * digit1 * digit1 ) + (digit2 * digit2 *digit2 ) + (digit3 * digit3 * digit3 );
			
			if(num1 == result) {
				System.out.println("ARMSTRONG NUMBER");
			}else {
				System.out.println("NOT ARMSTRONG NUMBER");
			
			
		}
	

	}

}
