package basicprob;
import java.util.*;

public class vowelcons {

	public static void main(String[] args) {
		Scanner words =new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=words.nextLine();
		StringBuilder name1 = new StringBuilder(name);
		int vowels=0,cons=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' 
				|| name.charAt(i)=='o' || name.charAt(i)=='u' || name.charAt(i)=='A' ||
				name.charAt(i)=='E' || name.charAt(i)=='O' || name.charAt(i)=='I' ||
				name.charAt(i)=='U') {
				vowels++;
				
			}
		}
			System.out.println("The vowels is: " + vowels);
			System.out.println("The consonent is: " + (name.length()-(vowels)));
			
					
		
		

	}

}
