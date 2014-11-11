package week7Lab3;

public class RandomNumber 
{	
	public int GetANumber(int lo, int hi)
	{
		return (int)(Math.random() * 3 + 1);
	}
}
