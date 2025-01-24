package basicprob;
import java.util.*;

class stud{
	int rollno;
	String name;
	
	stud(int  num1,String word){
		rollno=num1;
		name=word;
		
	}
	 void print(){
		System.out.println("ROLL NUM IS: " +rollno);
		System.out.println("NAME IS: " +name);
		System.out.println("-------------------------");
		
		
	}
}
public class student {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the limit");
		int num2=in.nextInt();
		System.out.println("Enter the Roll number:");
		int num1=in.nextInt();
		System.out.println("Enter the Name :");
		String word=in.nextLine();
		
		stud ob=new stud(num1,word);
		
		stud[] obj;
		obj=new stud[10];
		obj[num2]=new stud(num1,word);
		for(int i=5;i<num2;i++) {
		obj[i].print();
		}
	

	}

}
