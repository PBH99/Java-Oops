package oops;

class circle{
	private float radius;
	private double pi;
	private double circum,area;
	public void setradius(int i)
	{
		this.radius=i;
	}
	public void setpi(float p)
	{
		this.pi=p;
	}
	public double getcircum() {
		
		circum=2*pi*radius;
		return circum;
	}
	public double getarea() {
		area=pi*radius*radius;
		return area;
	}
		}
public class Gettersetters3 {

	public static void main(String[] args) {
      
		circle ob=new circle();
		
		ob.setradius(5);
		ob.setpi(3);
		System.out.println(ob.getcircum());
		System.out.println(ob.getarea());
	}

}
