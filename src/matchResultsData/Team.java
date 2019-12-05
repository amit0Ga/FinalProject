package matchResultsData;
import java.util.ArrayList;

public class Team {
	/*
	 * ArrayList < Object > starting_lineups = new ArrayList < Object > ();
	 * ArrayList < Object > substitutes = new ArrayList < Object > (); ArrayList <
	 * Object > coach = new ArrayList < Object > (); ArrayList < Object >
	 * missing_players = new ArrayList < Object > ();
	 */
	private int id;
	private String name;
	private int score;
	private double ballPossession;
	private int goalAttempts;
	private int shotsOnGoal; //בעיטות למסגרת
	private int shotsOffGoal;
	//int blockedShots;	// יתכון שנרצה להוסיף
	//int Goalkeeper Saves;
	private int attacks;
	private int DangerousAttacks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public  double getBallPossession() {
		return ballPossession;
	}
	
	
	
	public void setBallPossession(double ballPossession) {
		this.ballPossession = ballPossession;
	}
	public int getGoalAttempts() {
		return goalAttempts;
	}
	public void setGoalAttempts(int goalAttempts) {
		this.goalAttempts = goalAttempts;
	}
	public int getShotsOnGoal() {
		return shotsOnGoal;
	}
	public void setShotsOnGoal(int shotsOnGoal) {
		this.shotsOnGoal = shotsOnGoal;
	}
	public int getShotsOffGoal() {
		return shotsOffGoal;
	}
	public void setShotsOffGoal(int shotsOffGoal) {
		this.shotsOffGoal = shotsOffGoal;
	}
	public int getAttacks() {
		return attacks;
	}
	public void setAttacks(int attacks) {
		this.attacks = attacks;
	}
	public int getDangerousAttacks() {
		return DangerousAttacks;
	}
	public void setDangerousAttacks(int dangerousAttacks) {
		DangerousAttacks = dangerousAttacks;
	}
	
 // Getter Methods 

	


 // Setter Methods 


}