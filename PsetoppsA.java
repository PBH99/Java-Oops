/* Create a class employee with the following properties and methods
 * . Salary(property)(int)
 * . getsalary(method returning int)
 * . name(property)(string)
 * . getname(method returning string)
 * . setname(method changing name)
 */




package oops;

 class Employee{
private	int salary;
	private String name="Prashant";
	public void setsalary(int s)
	{
		this.salary =s;
	}
	public int  getsalary()
	{
		return salary;
	}
	public void setname(String n)
	{
		this.name=n;
	}
	public String getname() {
		return name;
	}
	
}
public class PsetoppsA {

	public static void main(String[] args) {
 
		Employee ob=new Employee();
		ob.setsalary(10000);
		ob.setname("Bubby");
 
		System.out.println("Name - "+ob.getname());
		System.out.println("Salary - "+ob.getsalary());
	}
}