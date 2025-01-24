package basicprob;
import java.util.*;

public class primenumhund {

	public static void main(String[] args) {
		Scanner num1 = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = num1.nextInt();
		int f=0;
		for(int i=0;i<num;i++)
			if(num%10==0) {
				f++;
				if(f==2) {
					System.out.println(" the number:" + f);
				}else {
					System.out.println("it is not prime number");
					}
			}
			
		}
		
	}


