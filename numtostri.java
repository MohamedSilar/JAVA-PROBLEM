package basicprob;

import java.util.Scanner;

public class numtostri {

	public static void main(String[] args) {
		Scanner name=new Scanner(System.in);
		System.out.println("Enter the letters:");
		String str=name.nextLine();
		StringBuilder words1=new StringBuilder(str);
		for(int i=0;i<words1.length();i++) {
			if(Character.isAlphabetic(words1.charAt(i))) {
				System.out.print(words1.charAt(i));
				}else {
					int x = Character.getNumericValue(words1.charAt(i));
					for(int j=1;j<x;j++) {
					System.out.print(words1.charAt(i-1));
				}
				}
		}
		


	}

}
