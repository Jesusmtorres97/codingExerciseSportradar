package codingExerciseSpotradar.codingExerciseSpotradar;

/**
 * Hello world!
 *
 */
public class Main 
{
	public static void main(String[] args) throws Exception {
		Scoreboard sb = new Scoreboard();
		
		sb.startGame("Mexico", "Canada");
		sb.startGame("Spain", "Brazil");
		sb.startGame("Germany", "France");
		sb.startGame("Uruguay", "Italy");
		sb.startGame("Argentina", "Australia");
		System.out.println("\nResults after starting the games");
		sb.getSummary();
		
		sb.updateScore("Argentina", "Australia", 3, 1);
		sb.updateScore("Uruguay", "Italy", 6, 6);
		sb.updateScore("Germany", "France", 2, 2);
		sb.updateScore("Spain", "Brazil", 10, 2);
		sb.updateScore("Mexico", "Canada", 0, 5);
		System.out.println("\nResults after updating the games");
		sb.getSummary();
		
		sb.finishGame("Uruguay", "Italy");
		System.out.println("\nResults after ending a game");
		sb.getSummary();
	}
}
