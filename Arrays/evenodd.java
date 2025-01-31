package arrays;
import java.util.*;

public class evenodd {
	public static void main(String args[]) {
		try (Scanner num = new Scanner(System.in)) {
			System.out.println("Enter the limit:");
			int even=0,odd=0;
			int limit = num.nextInt();
			int numbers[] = new int[limit];
			for(int i=0;i<limit;i++) {
				System.out.println("Enter the Number:["+ i +"]:");
				numbers[i] = num.nextInt();
				}for(int values : numbers) {
					System.out.println(values);
					if(values%2==0) {
				even++;
			}else {
				odd++;
			}
}
			System.out.println("The total even is:"+ even);
			System.out.println("The total even is:"+ odd);
			
		}
		
	}
}


