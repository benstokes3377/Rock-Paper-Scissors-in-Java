import java.util.Scanner;
public class PlayGame extends GameItems
{
	public static void main(String[] args)
	  {
		  Scanner scan = new Scanner(System.in);
		  Game game = new Game();

		  char quit = ' ';

		  while (quit != 'N')
		   {
			   game.play();

			   System.out.println("Play again? Press any key to continue, or 'N' to quit");
			   quit = scan.nextLine().toUpperCase().charAt(0);
		   }

		  scan.close();
		  game.displayStats();
	  }
  

}
