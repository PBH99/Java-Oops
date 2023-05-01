// Create a class cellphone with methods to print "ringing.... ","vibrating...",etc.
package oops;
class Cellphone{
	public void methodA() {
		System.out.println("Ringing ....");
	}
    public void methodB() {
    	System.out.print("Vibrating...");
    
    	}
}
public class PsetoppsB {

	public static void main(String[] args) {
		
		Cellphone ob=new Cellphone();
		ob.methodA();
		ob.methodB();

	}

}
