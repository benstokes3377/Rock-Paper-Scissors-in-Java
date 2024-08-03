public class Game extends GameItems 
{
		private Player player;
		private Computer computer;
		private CHOICES playerChoice;
		private CHOICES computerChoice;
		private static RESULT result;
		private static int wins;
		private static int losses;
		private static int ties;

	public Game()
	{
		super();
		player = new Player();
		computer = new Computer();
	}

	public void play()
	{
		playerChoice = player.getChoice();
		computerChoice = computer.getChoice();
		result = getResults();
        displayResults();
		stats();
	}

	private static void stats()
	{
		if (result == RESULT.WIN)
			++wins;
		else if (result == RESULT.LOSE)
			++losses;
		else
			++ties;
	}


	public void displayStats()
	{
		System.out.println("You played " +(wins+losses+ties)+" games.");
		System.out.println("You won " + wins + " games.");
		System.out.println("You lost " + losses + " games.");
		System.out.println("The ties happened " + ties + " times.");
	}

	private void displayResults()
	{
	  switch(result)
          {
		  case WIN:
			  System.out.println(playerChoice + " beats " + computerChoice + ". Player WINS");
			  break;
		  case LOSE:
			  System.out.println(computerChoice + " beats " + playerChoice + ". Computer WINS");
			  break;
		  case TIE:
		  System.out.println(playerChoice + " equals "+ computerChoice + ". Its a TIE!");
	   }
	}

	public RESULT getResults()
       	{
		if (playerChoice == computerChoice)
			return RESULT.TIE;
		switch(playerChoice)
		{
			case ROCK:
				return (computerChoice == CHOICES.SCISSOR ? RESULT.WIN : RESULT.LOSE);
			case PAPER:
				return (computerChoice == CHOICES.ROCK ? RESULT.WIN : RESULT.LOSE);
			case SCISSOR:
				return (computerChoice == CHOICES.PAPER ? RESULT.WIN : RESULT.LOSE);
		}


		return RESULT.LOSE;

	}
}
