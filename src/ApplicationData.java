import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import Table.TeamInATable;
import matchResultsData.Team;
import matchResultsData.MatchData;
import matchResultsData.Statistics;

public class ApplicationData {
	public String ApiURL;
	public String AllData;
	public JSONArray jsonArr;
	public MatchData[] match;
	public TeamInATable[] table;
	
	public ApplicationData() {
		ApiURL = "";
		jsonArr = null;
		AllData = "";
		match = null;
		table= new TeamInATable[24];
		
	}

	public void MatchDataFormatter(JSONObject jSONobj, int itt) {
		//
		match[itt] = new MatchData();
		Team matchHomeTeam = new Team();
		Team matchAwayTeam = new Team();
		//MISSING MATCH ID
		String temp = "";
		temp = (String)jSONobj.get("match_awayteam_id");
		match[itt].setMatch_awayteam_id(temp);
		matchAwayTeam.setId(Integer.parseInt(temp));

		
		temp = (String)jSONobj.get("match_awayteam_name");
		match[itt].setMatch_awayteam_name(temp);
		matchAwayTeam.setName(temp);
		
		System.out.println(" ");
		System.out.println(temp);
		
		temp = (String)jSONobj.get("match_awayteam_score");
		match[itt].setMatch_awayteam_score(temp);
		matchAwayTeam.setScore(Integer.parseInt(temp));
		
		temp = (String)jSONobj.get("match_date");
		match[itt].setMatch_date(temp);
		
		temp = (String)jSONobj.get("match_hometeam_id");
		match[itt].setMatch_hometeam_id(temp);
		matchHomeTeam.setId(Integer.parseInt(temp));

		temp = (String)jSONobj.get("match_hometeam_name");
		match[itt].setMatch_hometeam_name(temp);
		matchHomeTeam.setName(temp);
		
		System.out.println(" ");
		System.out.println(temp);

		
		temp = (String)jSONobj.get("match_hometeam_score");
		match[itt].setMatch_hometeam_score(temp);
		matchHomeTeam.setScore(Integer.parseInt(temp));
		match[itt].setMatch_id(temp);
		
		temp = (String)jSONobj.get("match_status");
		match[itt].setMatch_status(temp);
		
		JSONArray jsonStatisticsArr = (JSONArray)jSONobj.get("statistics");
		HashMap ballPossesion = (HashMap) jsonStatisticsArr.get(0); //���� ���� ����� �� �������� ����
		String toDouble = ((String) ballPossesion.get("home"));
		toDouble = toDouble.substring(0,2);
		matchHomeTeam.setBallPossession(Double.parseDouble(toDouble));
		
		toDouble = ((String) ballPossesion.get("away"));
		toDouble = toDouble.substring(0,2);
		matchAwayTeam.setBallPossession(Double.parseDouble(toDouble));
		ballPossesion = null;
		
		 jsonStatisticsArr = (JSONArray)jSONobj.get("statistics");
		HashMap goalAttempts = (HashMap) jsonStatisticsArr.get(1); //���� ���� ����� �� �������� ����
		 int  holder =  Integer.parseInt((String) ( goalAttempts.get("home")));
		matchHomeTeam.setGoalAttempts(holder);
		holder =  Integer.parseInt((String) ( goalAttempts.get("away")));
		matchAwayTeam.setGoalAttempts(holder);
		
		goalAttempts = null;
		
		 jsonStatisticsArr = (JSONArray)jSONobj.get("statistics");
		HashMap shotsOnGoal = (HashMap) jsonStatisticsArr.get(2); //���� ���� ����� �� �������� ����
		holder =  Integer.parseInt((String) ( shotsOnGoal.get("home")));
		matchHomeTeam.setShotsOnGoal(holder);
		holder =  Integer.parseInt((String) ( shotsOnGoal.get("away")));
		matchAwayTeam.setShotsOnGoal(holder);
		shotsOnGoal = null;
		
		 jsonStatisticsArr = (JSONArray)jSONobj.get("statistics");
		HashMap shotsOffGoal = (HashMap) jsonStatisticsArr.get(3); //���� ���� ����� �� �������� ����
		holder =  Integer.parseInt((String) ( shotsOffGoal.get("home")));
		matchHomeTeam.setShotsOffGoal(holder);	
		holder =  Integer.parseInt((String) ( shotsOffGoal.get("away")));
		matchAwayTeam.setShotsOffGoal(holder);
		shotsOffGoal = null;
		
			
		 jsonStatisticsArr = (JSONArray)jSONobj.get("statistics");
		HashMap Attacks = (HashMap) jsonStatisticsArr.get(10); //���� ���� ����� �� �������� ����
		holder =  Integer.parseInt((String) ( Attacks.get("home")));
		matchHomeTeam.setAttacks(holder);
		holder =  Integer.parseInt((String) ( Attacks.get("away")));
		matchAwayTeam.setAttacks(holder);
		Attacks = null;
		
		 jsonStatisticsArr = (JSONArray)jSONobj.get("statistics");
		HashMap DangerousAttacks = (HashMap) jsonStatisticsArr.get(11); //���� ���� ����� �� �������� ����
		holder =  Integer.parseInt((String) ( DangerousAttacks.get("home")));
		matchHomeTeam.setDangerousAttacks(holder);	
		holder =  Integer.parseInt((String) ( DangerousAttacks.get("away")));
		matchAwayTeam.setDangerousAttacks(holder);
		
		


		 
		 Statistics matchStat = new Statistics(matchHomeTeam, matchAwayTeam);
		match[itt].setMatchStat(matchStat);

	}
	public void printAllGood() {
		
		System.out.println("Good job mate" + match);

	}

	
	
	
	public void TablehDataFormatter(JSONObject jSONobj, int itt) {
		
		table[itt] = new TeamInATable();
	 

		int temp = 0;
		temp =  Integer.parseInt((String) jSONobj.get("overall_league_payed"));
		table[itt].setOverall_league_payed(temp);
		
		temp =  Integer.parseInt((String) jSONobj.get("overall_league_W"));
		table[itt].setOverall_league_W(temp);
		
		temp =  Integer.parseInt((String) jSONobj.get("overall_league_D"));
		table[itt].setOverall_league_D(temp);
		
		temp =  Integer.parseInt((String) jSONobj.get("overall_league_L"));
		table[itt].setOverall_league_L(temp);
		
		temp =  Integer.parseInt((String) jSONobj.get("overall_league_PTS"));
		table[itt].setOverall_league_PTS(temp);
		
		
		
		temp =  Integer.parseInt((String) jSONobj.get("home_league_position"));
		table[itt].setHome_league_position(temp);
		
		temp =  Integer.parseInt((String) jSONobj.get("home_league_payed"));
		table[itt].setHome_league_payed(temp);
		
		temp =  Integer.parseInt((String) jSONobj.get("home_league_W"));
		table[itt].setHome_league_W(temp);
		
		temp =  Integer.parseInt((String) jSONobj.get("home_league_D"));
		table[itt].setHome_league_D(temp);
		
		temp =  Integer.parseInt((String) jSONobj.get("home_league_L"));
		table[itt].setHome_league_L(temp);
		
		
		temp =  Integer.parseInt((String) jSONobj.get("home_league_PTS"));
		table[itt].setHome_league_PTS(temp);	
		
		
		
		
	
		
		
		
		temp =  Integer.parseInt((String) jSONobj.get("away_league_position"));
		table[itt].setAway_league_position(temp);
		
		temp =  Integer.parseInt((String) jSONobj.get("away_league_payed"));
		table[itt].setAway_league_payed(temp);
		
		temp =  Integer.parseInt((String) jSONobj.get("away_league_W"));
		table[itt].setAway_league_W(temp);
		
		temp =  Integer.parseInt((String) jSONobj.get("away_league_D"));
		table[itt].setAway_league_D(temp);
		
		temp =  Integer.parseInt((String) jSONobj.get("away_league_L"));
		table[itt].setAway_league_L(temp);
		
		
		temp =  Integer.parseInt((String) jSONobj.get("away_league_PTS"));
		table[itt].setAway_league_PTS(temp);	
		
		

		System.out.println(temp + " MACABBI ZONA");
		
		
		
	}
	
	
	
}
