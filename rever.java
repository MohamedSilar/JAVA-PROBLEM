package basicprob;
import java.util.*;

public class rever {
	public static void main(String[] args) {
		Scanner num1 = new Scanner (System.in);
		System.out.println("Enter the Number:");
		int num=num1.nextInt();
		        int n = num;
		        int factorial = 1;

		        do {
		            factorial *= n;
		            n--;
		        } while (n > 0);

		        System.out.println("Factorial of "+ n +"is: " + factorial);
		    }
		

	}


