import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import org.json.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

import matchResultsData.MatchData;

public class Utilities {
	
	static ApplicationData Data;
	//please merge
	
	public static void main(String args[]) {
		String resultsApi = "https://apiv2.apifootball.com/?action=get_events&from=$&to=*&league_id=149&APIkey=c8d7070a793a64e2caa3f0977247fcede6e90a5a38ac5a3f85963291ed7ecfc6";
		Data = new ApplicationData();
		Data.ResultApiURL = prepareResultsUrlTwoMonthsAgo(resultsApi);		
		
		try {
			//All results API
			String littleurl = "https://apiv2.apifootball.com/?action=get_events&from=2019-11-27&to=2019-11-29&league_id=149&APIkey=c8d7070a793a64e2caa3f0977247fcede6e90a5a38ac5a3f85963291ed7ecfc6";
			//Data.URLAddress = "https://apiv2.apifootball.com/?action=get_events&from=2019-11-27&to=2019-11-29&league_id=149&APIkey=c8d7070a793a64e2caa3f0977247fcede6e90a5a38ac5a3f85963291ed7ecfc6";
			Data.AllData = readUrl(littleurl);
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(Data.AllData);
			Data.jsonArr = (JSONArray)obj;
			JSONObject JSONobj = new JSONObject();
			Data.match = new MatchData[Data.jsonArr.size()];
			
			int itt = 0;
			for (Object object : Data.jsonArr) {
				JSONobj =(JSONObject) object;
				Data.MatchDataFormatter (JSONobj, itt);
				itt++;
			}
			
			//Next API
			//Write new preapre url function
			//overide Data.AllData
			//parse again
			//etc...
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	private static String readUrl(String urlString) throws Exception {
		try {
			HttpURLConnection con;	
			URL url = new URL(urlString);
			con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.connect();
			int responsecode = con.getResponseCode();
			Scanner sc = new Scanner(url.openStream());
			if (responsecode != 200)
				throw new RuntimeException("HttpResponseCode: " + responsecode);

			else {
				
				String inline = "";
				while (sc.hasNext()) {
					inline += sc.nextLine();
				}
				
				System.out.println(inline);
				/*
				 * JSONParser J = new JSONParser(); JSONObject jobj =
				 * (JSONObject)J.parse(inline);
				 */
				
				return inline;
			}
		}
		finally {
			
		}
		}

	private static String prepareResultsUrlTwoMonthsAgo(String urlString) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // In order to take to two last months.
		Date date = new Date();
		String today = dateFormat.format(date).toString();
		int x = Integer.parseInt(today.substring(5, 7)) - 2; // 5,7 refers to the month field, -2 refers to two months
																// later.

		switch (x) // Try to change to a more elegant code
		{
		case 0:
			x = 12;
			break;

		case -1:
			x = 11;
			break;
		}
		String twoMonthAgo = today.replace(today.substring(5, 7), String.valueOf(x));
		urlString = urlString.replace("$", twoMonthAgo);
		urlString = urlString.replace("*", today);
		System.out.println(urlString);

		return urlString;

	}
}