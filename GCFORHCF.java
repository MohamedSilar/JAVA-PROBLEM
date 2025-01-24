package basicprob;
import java.util.*;

public class GCFORHCF {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = num.nextInt();
		System.out.println("Enter the Second number:");
		int num2 = num.nextInt();
		
		int hcf = gfhf(num1 , num2);
		System.out.println("The GCF IS :" + hcf);
		
	}
		public static int gfhf(int a , int b){
			while(b!=0) {
				int temp = b;
				b = a % b;
				a = temp;
			}
			return a;
		
	}
		
	

}
