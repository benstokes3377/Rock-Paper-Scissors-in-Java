import java.util.Scanner;

public class Player extends GameItems
{
	Scanner scan;

	public Player()
	{
		super();
		scan = new Scanner(System.in);
	}

	public CHOICES getChoice()
	{
		System.out.println("Please enter your choice: R=ROCK,P=PAPER,S=SCISSOR");
		char playerChoice = scan.nextLine().toUpperCase().charAt(0);
	
		switch(playerChoice)
		{
			case 'R':
				return CHOICES.ROCK;
			case 'P':
				return CHOICES.PAPER;
			case 'S':
				return CHOICES.SCISSOR;
		}

		System.out.println("Invalid input!");
		return getChoice();
	} 
}	
