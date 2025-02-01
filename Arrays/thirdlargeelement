package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class thirdlargeelement {
	void thirdnum(int arr[]) {
		/*int first = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i] > first) {
				first = arr[i];
			}
		}
		int second = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(second < arr[i] && arr[i] < first) {
				second = arr[i];
			}
		}
		int third = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(third < arr[i] && second > arr[i]) {
				third = arr[i];
			}
			
		}
		System.out.print("The third Largest Element is :" + third);
		*/
		
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

		for (int num : arr) {
		    if (num > first) {
		        third = second;
		        second = first;
		        first = num;
		    } else if (num > second && num < first) {
		        third = second;
		        second = num;
		    } else if (num > third && num < second) {
		        third = num;
		    }
		}

		System.out.println("Third: " + third);
	}

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the Limit:");
		int num1 = num.nextInt();
		int number[] = new int[num1];
		for(int i=0;i<num1;i++) {
			System.out.print("Number is [" + i + "] :");
			number[i]= num.nextInt();
		}
		System.out.println("The Array Number is:" + Arrays.toString(number));
		thirdlargeelement large = new thirdlargeelement();
		large.thirdnum(number);

	}

}
