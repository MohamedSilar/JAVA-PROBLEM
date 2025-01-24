package basicprob;
import java.util.*;

public class identify_letters {

	public static void main(String[] args) {
		Scanner Words=new Scanner(System.in);
		System.out.println("Enter the names:");
		String name1=Words.nextLine();
		StringBuilder name=new StringBuilder(name1);
     int upcase=0,lowcase=0,number=0,space=0,symbols=0;
     for(int i=0;i<name1.length();i++) {
     if(name1.charAt(i) >= 97 && name1.charAt(i) <=122) {
    	 lowcase++;
     }if(name1.charAt(i) >= 65 && name1.charAt(i) <=90) {
    	 upcase++;
	}if(name1.charAt(i)==32) {
		space++;
	}if(name1.charAt(i)>=48 && name1.charAt(i)<=57) {
		number++;
	}
     }
     System.out.println("The upercase is:" + upcase);
     System.out.println("The lowercase is:" + lowcase);
     System.out.println("The space is:" + space);
     System.out.println("The Number is:" + number);
     System.out.println("The Symbol is:" + (name1.length()-(upcase+lowcase+space+number)));
     
	}
}

