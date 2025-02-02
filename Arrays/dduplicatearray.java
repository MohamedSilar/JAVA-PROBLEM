package arrays;
import java.util.*;

public class dduplicatearray {

	public static void main(String[] args) {
		try (Scanner num = new Scanner(System.in)) {
			System.out.println("Enter the Limit:");
			int n = num.nextInt();
			int lim[] = new int[n];
			
			for(int i=0;i<n;i++) {
				System.out.print("Number is [" + i + "] :");
				lim[i] = num.nextInt();
						}
			System.out.println("The Element is :" + Arrays.toString(lim));
			for(int j = 0; j<lim.length-1;j++) {
			for(int k = j+1;k<lim.length;k++) {
				if(lim[j]==lim[k] && (k!=j)) {
					System.out.print("The Dublicate Elements are:" +lim[k]);
				}
				
			}
}
		}
		
	}
}



