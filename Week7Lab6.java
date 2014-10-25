import java.util.Random;
import javax.swing.JOptionPane;

public class Week7Lab6
{
	public static void main(String[] args) 
	{
		String computerPlay = null;
		int count=1;
		Random randomPlay = new Random();
		
		JOptionPane.showMessageDialog(null, "It's the Rock, Paper, Scissors game!");
		
		do
		{
			RandomNumberconLab6 randomNumber = new RandomNumberconLab6();

			// sets the maximum and minimum random numbers
			randomNumber.randomPlay = randomPlay.nextInt(3) +1;
			
			// Setup up play by computer		
			if(randomNumber.randomPlay == 1)
				computerPlay = "ROCK";
			else if(randomNumber.randomPlay == 2)
				computerPlay = "PAPER";
			else if(randomNumber.randomPlay == 3)
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
				else if(computerPlay.equals("ROCK"))
					JOptionPane.showMessageDialog(null, "It's a tie!");
				else
					JOptionPane.showMessageDialog(null, "Invalid entry");
			}
			if(myPlay.equals("SCISSORS"))
			{
				if(computerPlay.equals("PAPER"))
					JOptionPane.showMessageDialog(null, "Scissors cut paper. You win!");
				else if(computerPlay.equals("ROCK"))
					JOptionPane.showMessageDialog(null, "Rock crushes scissors. You lose!");
				else if(computerPlay.equals("SCISSORS"))
					JOptionPane.showMessageDialog(null, "It's a tie!");
				else
					JOptionPane.showMessageDialog(null, "Invalid entry");
			}
			if(myPlay.equals("PAPER"))
			{
				if(computerPlay.equals("ROCK"))
					JOptionPane.showMessageDialog(null, "Paper covers rock. You win!");
				else if(computerPlay.equals("SCISSORS"))
					JOptionPane.showMessageDialog(null, "Scissors cut paper. You lose!");
				else if(computerPlay.equalsIgnoreCase("PAPER"))
					JOptionPane.showMessageDialog(null, "It's a tie!");
				else
					JOptionPane.showMessageDialog(null, "Invalid entry");
			}
			count++;
		} while(count<4);
	}
}
