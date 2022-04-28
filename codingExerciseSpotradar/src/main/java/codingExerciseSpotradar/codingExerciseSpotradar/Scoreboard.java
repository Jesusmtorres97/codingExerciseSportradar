package codingExerciseSpotradar.codingExerciseSpotradar;

import java.util.ArrayList;
import java.util.List;

public class Scoreboard {

	private List<Game> gameList = new ArrayList<>();

	public List<Game> getGames() {
		return gameList;
	}

	public void startGame(String home, String away) throws Exception {
		gameList.add(0, new Game(home, away));

	}

	public void finishGame(String home, String away) throws Exception {
		gameList.remove(new Game(home, away));
	}

	public void updateScore(String home, String away, int homeScore, int awayScore) throws Exception {
		int i = gameList.indexOf(new Game(home, away));
		Game g = gameList.get(i);
		g.setHomeScore(homeScore);
		g.setAwayScore(awayScore);
	}

	public void getSummary() throws Exception {
		gameList.stream().sorted().forEach(System.out::println);
	}
}
