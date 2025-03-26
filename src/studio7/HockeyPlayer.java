package studio7;

public class HockeyPlayer {
	private String name;
	private int number;
	private String handedness;
	private int goals;
	private int assists;
	private int points;
	private int games;

	public HockeyPlayer(String initName, int initNumber, String initHandedness) {
		name = initName;
		number = initNumber;
		handedness = initHandedness;
		goals = 0;
		assists = 0;
		points = 0;
		games = 0;
	}
	public void gameTotal(int goalsScored, int assistsMade) {
		goals += goalsScored;
		assists += assistsMade;
		points += 2*goalsScored + assistsMade;
		games++;
	}
	public String getNames() {
		return name;
	}
	public int getGames() {
		return games;
	}
	public int getPoints() {
		return points;
	}
	public static void main(String[] args) {
		HockeyPlayer player1 = new HockeyPlayer("Kate", 15, "Right");
		player1.gameTotal(4, 1);
		player1.gameTotal(2, 2);
		player1.gameTotal(0, 3);
		System.out.println(player1.getPoints());
		System.out.println(player1.getGames());

	}

}
