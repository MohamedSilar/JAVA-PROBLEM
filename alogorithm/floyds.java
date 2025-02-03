package algorithm;
import java.util.*;

public class floyds {
	public static boolean happy(int num) {
		int slow = num; int fast =num;
		do {
			slow = getsquare(slow);
			fast = getsquare(getsquare(fast));
		}while(slow != fast);
		return slow == 1;
	}
	public static int getsquare(int num) {
		int sum = 0; int digit = 0;
		while(num > 0) {
			digit = num % 10;
			sum += digit * digit;
			num/=10;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the Happy Numbers:");
		int num1 = num.nextInt();
		
		System.out.println(happy(num1));
		

	}

}
