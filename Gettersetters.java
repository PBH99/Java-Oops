package oops;
class get
{
	private int roll;
	private String name;
	private String add;
	
	public void setroll(int n)
	{
	   this.roll=n;	
	}

	public void setname(String i)
	{
		this.name=i;
	}
	public void setadd(String j)
	{
		this.add=j;
	}
	public int getroll()
	{
	  return roll;	
	}
	public  String getname()
	{
		return name;
		
	}
	public String getadd()
	{
		return add;
	}
}
public class Gettersetters {
	

	public static void main(String[] args) {
        get ob=new get();
        ob.setname("prashant");
        ob.setroll(35);
        ob.setadd("Mathura");
	System.out.println(ob.getroll());
	System.out.println(ob.getname());
	System.out.println(ob.getadd());
	}

}
