import java.util.Random;

public class RandomNumber 
{ 
	Random randomNumber = new Random();
	
	
	public int GetANumber_Between_1_and_3()
	{
		return (int)(Math.random() * 3 + 1);
	}
	
	public int GetANumber(int lo, int hi)
	{
					
		return (int)(Math.random() * 3 + 1);
	}
}
