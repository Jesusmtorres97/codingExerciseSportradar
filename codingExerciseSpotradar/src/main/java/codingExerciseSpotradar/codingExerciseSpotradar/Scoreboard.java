package codingExerciseSpotradar.codingExerciseSpotradar;

import java.util.ArrayList;
import java.util.List;

public class Scoreboard {

	private List<Game> gameList = new ArrayList<>();

	public List<Game> getGames() {
		return gameList;
	}
	
	// Starting game, adding to the first position of list	
	public void startGame(String home, String away) throws Exception {
		gameList.add(0, new Game(home, away));

	}

	// Finish a game by removing it
	public void finishGame(String home, String away) throws Exception {
		gameList.remove(new Game(home, away));
	}

	//	Update the score of a match
	public void updateScore(String home, String away, int homeScore, int awayScore) throws Exception {
		int i = gameList.indexOf(new Game(home, away));
		Game g = gameList.get(i);
		g.setHomeScore(homeScore);
		g.setAwayScore(awayScore);
	}

	// Shows the summary of all started matchs	
	public void getSummary() throws Exception {
		gameList.stream().sorted().forEach(System.out::println);
	}
}
