package week7Lab5;
import java.util.Random;
public class RandomNumber
{
	int randomPlay;

	public RandomNumber()
	{
		Random rand = new Random();
		randomPlay = rand.nextInt(3) + 1;
	}

}
