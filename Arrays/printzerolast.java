package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class printzerolast {
	static void lastzero(int[] arr) {
		int n = arr.length;
		int [] temp = new int[n];
		int j=0;
		for(int i =0;i<n;i++) {
			if(arr[i] !=0) 
				temp[j++] = arr[i];
			}
		
				while(j < n) 
					temp[j++] = 0;
				
				for(int i = 0;i<n;i++) {
					arr[i] = temp[i];
					
				}
				System.out.println("The Last Zero Of End is : "  + Arrays.toString(arr));
			}
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the Num Limit:");
		int num1 = num.nextInt();
		int arr[] = new int[num1];
		for(int i = 0 ; i<arr.length;i++) {
			System.out.println("Enter the Num " + i +":");
			arr[i]=num.nextInt();
		}
		System.out.println("The Array Number is:" + Arrays.toString(arr));
		printzerolast p1 = new printzerolast();
		p1.lastzero(arr);
		
		
		

	}

}
