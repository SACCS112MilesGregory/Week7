package week7Lab2;

import java.util.Random;

public class RandomNumber
{
	private int randomPlay;

	public int setGetANumber_Between_1_and_3()
	{
		Random generator = new Random();
		randomPlay = generator.nextInt(3) + 1;
		
		return randomPlay;
	}
	
	public int getGetANumber_Between_1_and_3()
	{
		return setGetANumber_Between_1_and_3();
	}
}
