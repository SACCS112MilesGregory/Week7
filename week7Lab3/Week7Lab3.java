package week7Lab3;
import javax.swing.JOptionPane;

public class Week7Lab3 
{
	public static void main(String[] args) 
	{
		String computerPlay = null;
		RandomNumber generator = new RandomNumber();
		int randomPlay;
		int count=0;
		
		JOptionPane.showMessageDialog(null, "It's the Rock, Paper, Scissors game!");
		
		do
		{
			randomPlay = generator.GetANumber(1, 3);
			
			// Setup up play by computer		
			if(randomPlay == 1)
				computerPlay = "ROCK";
			else if(randomPlay == 2)
				computerPlay = "PAPER";
			else if(randomPlay == 3)
				computerPlay = "SCISSORS";
			
			// Prompt user to enter Rock, Paper, or Scissors			
			String myPlay =
					JOptionPane.showInputDialog("Plesase enter Rock, Paper, or Scissors").toUpperCase();
			
			String message =
					String.format("Your play is %s", myPlay);
			
			JOptionPane.showMessageDialog(null, message);
			
			String message1 =
					String.format("The computer chose %s", computerPlay);
		
			JOptionPane.showMessageDialog(null, message1);
		
			// check the logic
			if(myPlay.equals("ROCK"))
			{
				if(computerPlay.equals("PAPER"))
				JOptionPane.showMessageDialog(null, "Paper covers rock. You lose!");
				else if(computerPlay.equals("SCISSORS"))
					JOptionPane.showMessageDialog(null, "Rock crushes scissors. You win!");
				else
					JOptionPane.showMessageDialog(null, "It's a tie!");
			}
			
			if(myPlay.equals("SCISSORS"))
			{
				if(computerPlay.equals("PAPER"))
					JOptionPane.showMessageDialog(null, "Scissors cut paper. You win!");
				else if(computerPlay.equals("ROCK"))
					JOptionPane.showMessageDialog(null, "Rock crushes scissors. You lose!");
				else
					JOptionPane.showMessageDialog(null, "It's a tie!");
			}
			if(myPlay.equals("PAPER"))
			{
				if(computerPlay.equals("ROCK"))
					JOptionPane.showMessageDialog(null, "Paper covers rock. You win!");
				else if(computerPlay.equals("SCISSORS"))
					JOptionPane.showMessageDialog(null, "Scissors cut paper. You lose!");
				else
					JOptionPane.showMessageDialog(null, "It's a tie!");
			}
			count++;
		} while(count<4);
	}
}
