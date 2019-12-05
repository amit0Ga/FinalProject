import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import matchResultsData.MatchData;

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
		String val = "";
		
		val = (String)jSONobj.get("match_hometeam_system");
		match[itt].setMatch_hometeam_system(val);

		val = (String)jSONobj.get("match_hometeam_system");
		match[itt].setMatch_hometeam_system(val);
		
		val = (String)jSONobj.get("match_hometeam_system");
		match[itt].setMatch_hometeam_system(val);
		
		val = (String)jSONobj.get("match_hometeam_system");
		match[itt].setMatch_hometeam_system(val);
		
		val = (String)jSONobj.get("match_hometeam_system");
		match[itt].setMatch_hometeam_system(val);
	}

	
}
