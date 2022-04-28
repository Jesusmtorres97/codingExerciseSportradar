package codingExerciseSpotradar.codingExerciseSpotradar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {
	@Test
	public void newGameTestPass1() {
		Game g = new Game("Spain", "Brazil");
		assertTrue(g.getGoalsSum() == 0);
	}

	@Test
	public void newGameTestPass2() {
		Game g = new Game("Spain", "Brazil", 1, 0);
		assertTrue(g.getGoalsSum() == 1);
	}

	@Test
	public void startGameTestPass() throws Exception {
		Scoreboard sb = new Scoreboard();
		String homeTeam = "a";
		String awayTeam = "b";

		sb.startGame(homeTeam, awayTeam);
		assertTrue(sb.getGames().size() == 1);
	}

	@Test
	public void startGameTestFail() {
		try {
			Scoreboard sb = new Scoreboard();

			String homeTeam = "a";
			String awayTeam = "";

			sb.startGame(homeTeam, awayTeam);
			fail("An exception was expected");
		} catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void finishGameTestPass() throws Exception {
		Scoreboard sb = new Scoreboard();
		String homeTeam = "a";
		String awayTeam = "b";

		sb.startGame(homeTeam, awayTeam);
		assertTrue(sb.getGames().size() == 1);
		sb.finishGame(homeTeam, awayTeam);
		assertTrue(sb.getGames().size() == 0);
	}

	@Test
	public void finishGameTestFail() throws Exception {
		try {
			Scoreboard sb = new Scoreboard();
			String homeTeam = "a";
			String awayTeam = "b";

			sb.finishGame(homeTeam, awayTeam);
			fail("An exception was expected");
		} catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void updateScoreTestPass() throws Exception {
		Scoreboard sb = new Scoreboard();
		String homeTeam = "a";
		String awayTeam = "b";

		sb.startGame(homeTeam, awayTeam);
		assertTrue(sb.getGames().size() == 1);
		sb.updateScore(homeTeam, awayTeam, 6, 4);
		assertTrue(sb.getGames().get(sb.getGames().indexOf(new Game(homeTeam, awayTeam))).getGoalsSum() == 10);
	}

	@Test
	public void updateScoreTestFailNegative() throws Exception {
		try {
			Scoreboard sb = new Scoreboard();
			String homeTeam = "a";
			String awayTeam = "b";

			sb.startGame(homeTeam, awayTeam);
			assertTrue(sb.getGames().size() == 1);
			sb.updateScore(homeTeam, awayTeam, -6, 4);
			fail("An exception was expected");
		} catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void updateScoreTestFailStart() throws Exception {
		try {
			Scoreboard sb = new Scoreboard();
			String homeTeam = "a";
			String awayTeam = "b";

			sb.updateScore(homeTeam, awayTeam, 6, 4);
			fail("An exception was expected");
		} catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void getSummaryPass() throws Exception {
		Scoreboard sb = new Scoreboard();
		String homeTeam = "a";
		String awayTeam = "b";

		sb.startGame(homeTeam, awayTeam);
		sb.getSummary();
	}

	@Test
	public void getSummaryNoGames() {
		Scoreboard sb = new Scoreboard();
		sb.getSummary();
		assertTrue(sb.getGames().size() == 0);
	}
}