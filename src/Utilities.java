import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Utilities {
	public static void main (String args[])
	{
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String today = dateFormat.format(date).toString();
        System.out.println(Integer.parseInt(today.substring(4, 7)) % 12);
        String twoMonthAgo = today.replace(today.substring(4, 6),String.valueOf(Integer.parseInt(today.substring(4, 7))-2 % 12));
		String resultsApi = "https://apiv2.apifootball.com/?action=get_events&from="+twoMonthAgo+"&to="+today+"&league_id=468&APIkey=c8d7070a793a64e2caa3f0977247fcede6e90a5a38ac5a3f85963291ed7ecfc6";

		
//chack if connect to git 
		System.out.println(resultsApi);

		
		try {
			readUrl(resultsApi);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static String readUrl(String urlString) throws Exception {
	    BufferedReader reader = null;
	    try {
	        URL url = new URL(urlString);
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
}
