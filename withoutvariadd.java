package basicprob;



public class withoutvariadd {
	
	
		public static int add(int a,int b) {
			while(b!=0) {
				int carry=(a&b)<<1;
				a=a^b;
				b=carry;
				
			}
			return a;
		}
	
		

	public static void main (String args[]) {
    int num1=10;
    int num2=10;
    int sum=add(num1,num2);
    System.out.println("Sum is" + sum);
}
	}
