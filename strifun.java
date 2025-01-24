package basicprob;
import java.util.*;

public class strifun {

	public static void main(String[] args) {
		Scanner name=new Scanner(System.in);
		System.out.println("Enter the letters:");
		String words=name.nextLine();
		int count;
		for(int i=0;i<words.length();i=i+count) {
			 count=1;
			for(int j=i+1;j<words.length();j++) {
				if(words.charAt(i)==words.charAt(j)) {
					count=+1;
					}else{
					break;
				}
			}
			System.out.print(words.charAt(i) +""+ count);
			
		}
		

	}

}
