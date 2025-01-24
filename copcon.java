package basicprob;

class prob{
	private int real,image;
	
	public prob(){
		this.real=10;
		this.image=20;
	}
	public prob(prob p1){
		this.real=p1.real;
		this.image=p1.image;
	}
	public prob(int x,int y){
		this.real=x;
		this.image=y;
	}
	public String  toString() {
	return "(" + real + "+" + image + "i)";
}
}
public class copcon {

	public static void main(String[] args) {
		
		prob p=new prob();
		System.out.println("The problem statement is:" + p);
		
		prob p1=new prob(2,5);
		System.out.println("The problem statement is:" + p1);
		
		prob p3=new prob();
		System.out.println("The problem statement is:" + p3);

	}

}
