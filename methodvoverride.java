package basicprob;
class user{
	
	//method overriding
	String name;
	int age;
	user(int a,String b){
		this.age=a;
		this.name=b;
		
	}
	public void display() {
		System.out.println("The name is:" + name);
		System.out.println("The age is" + age);
	}
}
class company extends user{
	String companyname;
	company(int a,String b,String c){
		super(a,b);
		this.companyname=c;
		
		
	}
	public void display() {
		System.out.println("The name is:" + name);
		System.out.println("The age is:" + age);
		System.out.println("The company name is:" + companyname);
		
	
}
}
public class methodvoverride {

	public static void main(String[] args) {
	company u1=new company(10,"Silar","precidio");
	u1.display();
		
	

	}

}
