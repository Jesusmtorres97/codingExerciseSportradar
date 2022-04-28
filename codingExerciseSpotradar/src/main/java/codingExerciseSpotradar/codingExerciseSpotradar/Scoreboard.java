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
		if (home.equals("") || away.equals("")) {
			throw new Exception("Team names must not be empty");
		} else {
			gameList.add(0, new Game(home, away));
		}

	}

	public void finishGame(String home, String away) throws Exception {
		Game g = new Game(home, away);
		if (gameList.contains(g)) {
			gameList.remove(g);
		} else {
			throw new Exception("Game " + g + " can not be removed. It have not started yet.");
		}
	}

	// Update the score of a game
	public void updateScore(String home, String away, int homeScore, int awayScore) throws Exception {
		Game game = new Game(home, away);
		if (homeScore < 0 || awayScore < 0) {
			throw new Exception("Scores must not be negative");
		} else if (!gameList.contains(game)) {
			throw new Exception("Game " + game + " can not be updated. It have not started yet.");
		} else {
			int i = gameList.indexOf(game);
			Game g = gameList.get(i);
			g.setHomeScore(homeScore);
			g.setAwayScore(awayScore);
		}
	}

	// Shows the summary of all started games
	public void getSummary() {
		if (gameList == null || gameList.isEmpty()) {
			System.out.println("There is no started games");
		} else {
			gameList.stream().sorted().forEach(System.out::println);
		}
	}
}