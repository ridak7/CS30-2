import java.lang.Comparable;
public class Puck extends Disk {

	private double weight;
	
	public Puck(double r, double t, double w)
	{
		super(r, t);
		weight = w;
	}
	
	public void setWeight(double newW)
	{
		weight = newW;
	}
	
	public double getWeight()
	{
		return(weight);
	}
	
	public String getDivision()
	{
		if(4 <= weight && weight < 4.5)
		{
			
			return("youth");
		}
		else if(5 <= weight && weight < 5.5)
		{
			return("standard");
		}
		else
		{
		return("n/a");
		}
	}
	
	public boolean equals(Object p)
	{
		Puck tester = (Puck)p;
		
		if(tester.getRadius() == super.getRadius() && tester.getThickness() == super.getThickness() && tester.getWeight() == weight)
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
		return("The puck has radius " + super.getRadius() + ", thickness " + super.getThickness() + " and weight " + weight + ".");
	}
	
	public int compareTo(Object p)
	{
		Puck tester = (Puck)p;
		
		if (weight < tester.getWeight())
		{
			return(-1);
		}
		else if(weight == tester.getWeight())
		{
			return(0);
		}
		else
		{
			return(1);
		}
	}
	
}
