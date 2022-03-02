
public class Disk extends Circle 
{
	
	private double thickness;
	
	public Disk(double r, double t)
	{
		super(r);
		thickness = t;
	}
	
	public void setThickness(double newThickness)
	{
		thickness = newThickness;
	}
	
	public double getThickness()
	{
		return(thickness);
	}
	
	public double volume()
	{
		double v;
		
		v = super.area() * thickness;
		return v;
	}
	
	public boolean equals(Object d) 
	{
		Disk tester = (Disk)d;
		
		if(tester.getRadius() == super.getRadius() && tester.getThickness() == thickness)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	public String toString()
	{
		return("The disk has radius " + super.getRadius() + " and thickness " + thickness);
	}
}
