package basicprob;

import java.util.Scanner;

public class basic2{
	
		//armstrong Number
	public static void arms(int number) {
		int temp=number;
		
		int digit1,digit2,digit3;
		
	  digit3=temp%10;
	  temp=temp/10;
	  
	  digit2=temp%10;
	  temp=temp/10;
	  
	  digit1=temp%10;
	  
	  int result=(digit3*digit3*digit3)+(digit2*digit2*digit2)+(digit1*digit1*digit1);
	    
		if(result==number) {
			  System.out.println("This a aramstrong number:");
		  }else {
			  System.out.println("This is not a armstrong number");
		  }	  
			  }
		  

	  
	public static void main(String args[]) {
		Scanner nums=new Scanner(System.in);
		basic2 a1=new basic2();
		System.out.println("Enter the number is:");
		int number =nums.nextInt();
		a1.arms(number);
		
		
		
		
	}
}
