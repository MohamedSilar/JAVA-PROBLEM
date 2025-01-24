package basicprob;
import java.util.*;

public class reversearr {
	public static void bin(int num1)
	{
		//decimal to binary number
		int[] arr =new int[1000];
		int i=0;
		while(num1 > 0) {
			arr[i] =num1%2;
			num1=num1/2;
			i++;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(arr[j]);
		}
	}

	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		System.out.print("Enter the number:");
		
		int num1=num.nextInt();
		System.out.println("The binary number is:" + num1);
		System.out.print("The decimal number is:");
		
	      bin(num1);
		
		
	}

}
