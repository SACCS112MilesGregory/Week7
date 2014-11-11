package week7Lab4;

public class RandomNumber 
{
	private int randomPlay;
	
	public RandomNumber()
	{
		setRandomPlay(1 + (int)(Math.random() * 3));
	}

	public int getRandomPlay() {
		return randomPlay;
	}

	public void setRandomPlay(int randomPlay) {
		this.randomPlay = randomPlay;
	}
}
