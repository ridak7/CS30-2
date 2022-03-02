
public class Hockey {

	public static void main(String[] args) 
	{
		
		Puck grey = new Puck(1.5, 0.8, 4.4);
		
		System.out.println("The puck has radius: " + grey.getRadius());
		System.out.println("The puck has volume: " + grey.volume());
		System.out.println("Meant for division: " + grey.getDivision());
		System.out.println("The puck has weight: " + grey.getWeight());

		Puck first = new Puck(1.5, 1.0, 4.9);
		Puck second = new Puck(1.3, 0.7, 4.5);
		Puck third = new Puck(1.5, 1.0, 4.9);
		
		if(first.equals(second))
		{
			System.out.println("First and second pucks are equal");
		}
		else
		{
			System.out.println("First and second pucks are not equal");
		}
		if(first.equals(third))
		{
			System.out.println("First and third pucks are equal");
		}
		else
		{
			System.out.println("First and third pucks are not equal");
		}
		if(third.equals(second))
		{
			System.out.println("Third and second pucks are equal");
		}
		else
		{
			System.out.println("Third and second pucks are not equal");
		}
		
		if(first.compareTo(second) < 0)
		{
			System.out.println("The first puck is smaller than the second");
		}
		else if(first.compareTo(second) == 0)
		{
			System.out.println("The first puck is equal to the second");
		}
		else
		{
			System.out.println("The first puck is larger than the second");
		}
	}

}

/*Screen Dump
 
 The puck has radius: 1.5
The puck has volume: 5.654866776461623
Meant for division: youth
The puck has weight: 4.4
First and second pucks are not equal
First and third pucks are equal
Third and second pucks are not equal
The first puck is larger than the second

 */
 
