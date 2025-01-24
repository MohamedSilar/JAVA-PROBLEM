package basicprob;
import java.util.*;

// hierarical inheritance
class calc{
	int firstnum,secondnum;
}
class addition extends calc{
	public addition(int num1,int num2) {
		firstnum=num1;
		secondnum=num2;
	}int addi(){
		return firstnum+secondnum;
		
	}
	
}
class multiple extends calc{
	public multiple(int num1, int num2) {
		firstnum=num1;
		secondnum=num2;}
	int multi () {
		return firstnum*secondnum;
		
	}
}
class division extends calc{
	public division(int num1,int num2) {
		firstnum=num1;
		secondnum=num2;
	} int divide() {
		return firstnum /secondnum;
	}
	}

class subtraction extends calc{
	public subtraction(int num1,int num2) {
		firstnum=num1;
		secondnum=num2;
	}
	int subt() {
		return firstnum-secondnum;
		
	}
}

class modlation extends calc{
	public modlation(int num1,int num2) {
		firstnum=num1;
		secondnum=num2;
	}
	int model() {
		return firstnum%secondnum;
		
	}
}
public class hierainher {
	public static void main(String[] args) {
		
		Scanner num=new Scanner(System.in);
		String[] name= {"1.SUBTRACTION\n 2.MULTIPLICATION \n 3. ADDITION \n 4.DIVISION"};
		for(String arr:name) {
			System.out.println(arr);
		}
		
		System.out.println("Enter the first number:");
		int num1=num.nextInt();
		System.out.println("Enter the second number:");
		
		int num2=num.nextInt();
			subtraction c1=new subtraction(num1,num2);
		addition c2=new addition(num1,num2);
		division c3=new division(num1,num2);
		multiple c4=new multiple(num1,num2);
		modlation c5=new modlation(num1,num2);
		
		System.out.println("The Susbstraction is:" + c1.subt());
		System.out.println("The multiplicatio  is:" + c4.multi());
		System.out.println("The addition is:" + c2.addi());
		System.out.println("The division is:" + c3.divide());
		System.out.println("The modalation is:" + c5.model());
		
		
	}

}
