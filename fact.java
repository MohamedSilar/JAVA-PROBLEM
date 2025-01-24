package basicprob;
import java.util.*;

public class fact {
	public static int fact1(int num1) {
		int fact2=1;
		for(int i=1;i<=num1;i++) {
			fact2=fact2*i;
			
		}
		return fact2;
		
	}

	public static void main(String[] args) {
		Scanner num=new Scanner (System.in);
		System.out.println("Enter the number is:");
		int num1=num.nextInt();
		/*int fact1=1;
		for(int i=1;i<=num1;i++) {
			fact1=fact1*i;
			
			
		}
		System.out.println("THE FACT IS:" + fact1);
		*/
		fact f1=new fact();
	System.out.println("The factorial is:" + f1.fact1(num1));
		
		
	

	}

}
