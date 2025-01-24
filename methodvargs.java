package basicprob;
import java.util.*;

public class methodvargs {
	public static void getname(String... name) {
		for(String names:name)
		System.out.println(names);
	}

	public static void main(String[] args) {
		Scanner word=new Scanner(System.in);
		String names=word.next();
		getname(names);
		String words=names;
		
		
	}

}
