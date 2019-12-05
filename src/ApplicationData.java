import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import matchResultsData.Team;
import matchResultsData.MatchData;
import matchResultsData.Statistics;

public class ApplicationData {
	public String ResultApiURL;
	public String AllData;
	public JSONArray jsonArr;
	public MatchData[] match;
	
	public ApplicationData() {
		ResultApiURL = "";
		jsonArr = null;
		AllData = "";
		match = null;
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
		
		temp = (String)jSONobj.get("match_hometeam_score");
		match[itt].setMatch_hometeam_score(temp);
		matchHomeTeam.setScore(Integer.parseInt(temp));
		match[itt].setMatch_id(temp);
		
		temp = (String)jSONobj.get("match_status");
		match[itt].setMatch_status(temp);
		
		JSONArray jsonStatisticsArr = (JSONArray)jSONobj.get("statistics");
		HashMap ballPossesion = (HashMap) jsonStatisticsArr.get(0); //בוחר איזה השדות של ססטיסטקס לקחת
		String toDouble = ((String) ballPossesion.get("home"));
		toDouble = toDouble.substring(0,2);
		matchHomeTeam.setBallPossession(Double.parseDouble(toDouble));
		
		toDouble = ((String) ballPossesion.get("away"));
		toDouble = toDouble.substring(0,2);
		matchAwayTeam.setBallPossession(Double.parseDouble(toDouble));
		ballPossesion = null;
		
		 jsonStatisticsArr = (JSONArray)jSONobj.get("statistics");
		HashMap goalAttempts = (HashMap) jsonStatisticsArr.get(1); //בוחר איזה השדות של ססטיסטקס לקחת
		 int  holder =  Integer.parseInt((String) ( goalAttempts.get("home")));
		matchHomeTeam.setGoalAttempts(holder);
		holder =  Integer.parseInt((String) ( goalAttempts.get("away")));
		matchAwayTeam.setGoalAttempts(holder);
		
		goalAttempts = null;
		
		 jsonStatisticsArr = (JSONArray)jSONobj.get("statistics");
		HashMap shotsOnGoal = (HashMap) jsonStatisticsArr.get(2); //בוחר איזה השדות של ססטיסטקס לקחת
		holder =  Integer.parseInt((String) ( shotsOnGoal.get("home")));
		matchHomeTeam.setShotsOnGoal(holder);
		holder =  Integer.parseInt((String) ( shotsOnGoal.get("away")));
		matchAwayTeam.setShotsOnGoal(holder);
		shotsOnGoal = null;
		
		 jsonStatisticsArr = (JSONArray)jSONobj.get("statistics");
		HashMap shotsOffGoal = (HashMap) jsonStatisticsArr.get(3); //בוחר איזה השדות של ססטיסטקס לקחת
		holder =  Integer.parseInt((String) ( shotsOffGoal.get("home")));
		matchHomeTeam.setShotsOffGoal(holder);	
		holder =  Integer.parseInt((String) ( shotsOffGoal.get("away")));
		matchAwayTeam.setShotsOffGoal(holder);
		shotsOffGoal = null;
		
			
		 jsonStatisticsArr = (JSONArray)jSONobj.get("statistics");
		HashMap Attacks = (HashMap) jsonStatisticsArr.get(10); //בוחר איזה השדות של ססטיסטקס לקחת
		holder =  Integer.parseInt((String) ( Attacks.get("home")));
		matchHomeTeam.setAttacks(holder);
		holder =  Integer.parseInt((String) ( Attacks.get("away")));
		matchAwayTeam.setAttacks(holder);
		Attacks = null;
		
		 jsonStatisticsArr = (JSONArray)jSONobj.get("statistics");
		HashMap DangerousAttacks = (HashMap) jsonStatisticsArr.get(11); //בוחר איזה השדות של ססטיסטקס לקחת
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

	
}
