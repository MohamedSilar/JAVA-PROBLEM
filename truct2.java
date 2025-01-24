package basicprob;


class box{
    int length,width;
    
    box(){
    	length=10;
    	width=20;
    }
    box(int x,int y){
    	length=x;
    	width=y;
    	
    }
    box(int x){
    	length=width=x;
    }
    int area() {
    	int result=length*width;
    	return result;
    }
}

public class truct2 {

	public static void main(String[] args) {
	   box b =new box();
	   System.out.println("The box size is:" + b.area());

	   box b1 =new box(2,4);
	   System.out.println("The box size is:" + b1.area());

	   
	   box b2 =new box(2);
	   System.out.println("The box size is:" + b2.area());

	}

}
