
public class GameBooth 
{
	private double cost;
	private String firstPrize, consolationPrize;
	
	GameBooth(double charge, String p1, String p2)
	{
		cost = charge;
		firstPrize = p1;
		consolationPrize = p2;
	}
	public String Start()
	{
		int toss;
		int successes = 0;
		for (int i = 0; i < 3; i++)
		{
			toss = (int)(Math.random() + 0.5);
			if(toss == 1)
			{
				successes += 1;
			}
		}
		
		if(successes == 3)
		{
			return(firstPrize);
		}
		else
		{
			return(consolationPrize);
		}
		
	}
	public double getCost()
	{
		return(cost);
	}
}
