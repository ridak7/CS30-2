
public class Circle {
	
	private static final double PI = 3.14159265358979;
	private double radius;
	
	public Circle()
	{
		radius = 1;
	}
	
	public Circle(double r)
	{
		radius = r;
	}
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}
	
	public double area()
	{
		double cArea;
		
		cArea = PI * radius * radius;
		return(cArea);
	}
	
	public double getRadius()
	{
		return(radius);
	}
	
	public double circumference()
	{
		double c;
		c = 2 * PI * radius;
		return(c);
	}
	public boolean equals(Object c)
	{
		Circle testObj = (Circle)c;
		
		if(testObj.getRadius() == radius)
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
		return("the circle has radius: " + radius);
	}
	
}
