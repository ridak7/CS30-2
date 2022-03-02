package University;

public class Faculty extends UEmployee 
{
	private String department;

	public Faculty(String n, double s, String d) 
	{
		super(n, s);
		department = d;
	}
	
	public String getDepartment()
	{
		return(department);
	}
	
	public String toString()
	{
		return(super.getName() + " has salary: " + super.getSalary() + " and works in the " + department + " department.");
	}
	
}
