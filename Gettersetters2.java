package oops;

class a{
	private int roll;
	private String name;
	private String State;
	
	public void setroll(int i)
	{
		this.roll=i;
	}
	public void setname(String j) {
		this.name=j;
	}
	public void setState(String k) {
		this.State=k;
	}
	public int getroll()
	{
		return roll;
	}
	public String getname()
	{
		return name;
	}
	public String getState()
	{
		return State;
	}
}

public class Gettersetters2 {

	public static void main(String[] args) {
	a ob=new a();
	ob.setroll(35);
	ob.setname("Prashant bharadwaj");
	ob.setState("Mathura");

	System.out.println(ob.getroll());
	System.out.println(ob.getname());
	System.out.println(ob.getState());
	}

}
