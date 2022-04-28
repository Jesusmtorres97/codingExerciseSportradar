package codingExerciseSpotradar.codingExerciseSpotradar;

public class Game implements Comparable<Object>{
	private String homeTeam;
	private String awayTeam;
	private int homeScore;
	private int awayScore;
	
//	Constructor without scores
	public Game(String home, String away) {
		this.homeTeam = home;
		this.awayTeam = away;
	}
	
//	Constructor with scores
	public Game(String home, String away, int homeScore, int awayScore) {
		this.homeTeam = home;
		this.awayTeam = away;
		this.homeScore = homeScore;
		this.awayScore = awayScore;
	}
	
	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}

	public int getHomeScore() {
		return homeScore;
	}

	public void setHomeScore(int homeScore) {
		this.homeScore = homeScore;
	}

	public int getAwayScore() {
		return awayScore;
	}

	public void setAwayScore(int awayScore) {
		this.awayScore = awayScore;
	}
	
	public Integer getGoalsSum() {
		return Integer.valueOf(homeScore + awayScore);
	}

	public int compareTo(Object o) {
		Game other = (Game) o;
		return other.getGoalsSum().compareTo(getGoalsSum());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + awayScore;
		result = prime * result + ((awayTeam == null) ? 0 : awayTeam.hashCode());
		result = prime * result + homeScore;
		result = prime * result + ((homeTeam == null) ? 0 : homeTeam.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object o) {
		Game other = (Game) o;
		return homeTeam.equals(other.homeTeam) && awayTeam.equals(other.awayTeam); 
	}

	@Override
	public String toString() {
		return homeTeam + " " + homeScore + " - " + awayTeam + " " + awayScore;
	}
	
	
	
	
	
}
