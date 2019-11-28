import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import org.json.*;


public class Utilities {
	public static void main (String args[])
	{
		String resultsApi = "https://apiv2.apifootball.com/?action=get_events&from=$&to=*&league_id=468&APIkey=c8d7070a793a64e2caa3f0977247fcede6e90a5a38ac5a3f85963291ed7ecfc6";		
		try {
			readUrl(prepareResultsUrlTwoMonthsAgo(resultsApi));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//JSONParser parse = new JSONParser();
		
	}
	private static String readUrl(String urlString) throws Exception {
	    BufferedReader reader = null;
	    try {
	        URL url = new URL(urlString);
	        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
	        reader = new BufferedReader(new InputStreamReader(url.openStream()));
	        StringBuffer buffer = new StringBuffer();
	        int read;
	        char[] chars = new char[1024];
	        while ((read = reader.read(chars)) != -1)
	            buffer.append(chars, 0, read); 

	        return buffer.toString();
	    } finally {
	        if (reader != null)
	            reader.close();
	    }
	}
	private static String prepareResultsUrlTwoMonthsAgo(String urlString)
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 	// In order to take to two last months.
        Date date = new Date();
        String today = dateFormat.format(date).toString();
        int x = Integer.parseInt(today.substring(5, 7)) -2; // 5,7 refers to the month field, -2 refers to two months later.
        
        switch(x)	// Try to change to a more elegant code
        {
    	case 0:
    		x=12;
    		break;
    		
    	case -1:
    		x=11;
    		break;
        }
        String twoMonthAgo = today.replace(today.substring(5, 7),String.valueOf(x)); 
        urlString = urlString.replace("$", twoMonthAgo);
        urlString = urlString.replace("*", today);
        System.out.println(urlString);
        return urlString;
	}
}
